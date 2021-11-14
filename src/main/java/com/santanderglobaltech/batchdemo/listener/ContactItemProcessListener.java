package com.santanderglobaltech.batchdemo.listener;


import com.santanderglobaltech.batchdemo.domain.Contact;
import com.santanderglobaltech.batchdemo.domain.DataOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemProcessListener;

public class ContactItemProcessListener implements ItemProcessListener<Contact, DataOut> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContactItemProcessListener.class);

    @Override
    public void beforeProcess(Contact Contact) {
        LOGGER.info("beforeProcess");
    }

    @Override
    public void afterProcess(Contact Contact, DataOut DataOut) {
        LOGGER.info("afterProcess: " + Contact + " ---> " + DataOut);
    }

    @Override
    public void onProcessError(Contact Contact, Exception e) {
        LOGGER.info("onProcessError");
    }
}
