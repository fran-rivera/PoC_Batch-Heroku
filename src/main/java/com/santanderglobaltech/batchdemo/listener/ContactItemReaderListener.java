package com.santanderglobaltech.batchdemo.listener;

import com.santanderglobaltech.batchdemo.domain.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemReadListener;

public class ContactItemReaderListener implements ItemReadListener<Contact> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContactItemReaderListener.class);

    @Override
    public void beforeRead() {
        LOGGER.info("beforeRead");
    }

    @Override
    public void afterRead(Contact Contact) {
        LOGGER.info("afterRead: " + Contact.toString());
    }

    @Override
    public void onReadError(Exception e) {
        LOGGER.info("onReadError");
    }
}
