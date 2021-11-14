package com.santanderglobaltech.batchdemo.listener;


import com.santanderglobaltech.batchdemo.domain.DataOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

public class ContactItemWriterListener implements ItemWriteListener<DataOut> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContactItemWriterListener.class);

    @Override
    public void beforeWrite(List<? extends DataOut> list) {
        LOGGER.info("beforeWrite");
    }


    @Override
    public void afterWrite(List<? extends DataOut> list) {
        for (DataOut DataOut : list) {
            LOGGER.info("afterWrite :" + DataOut.toString());
        }
    }

    @Override
    public void onWriteError(Exception e, List<? extends DataOut> list) {
        LOGGER.info("onWriteError");
    }
}
