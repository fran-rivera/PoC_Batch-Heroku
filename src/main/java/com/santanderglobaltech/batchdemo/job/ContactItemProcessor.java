package com.santanderglobaltech.batchdemo.job;

import com.santanderglobaltech.batchdemo.domain.Contact;
import com.santanderglobaltech.batchdemo.domain.DataOut;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class ContactItemProcessor implements ItemProcessor<Contact, DataOut> {
    @Override
    public DataOut process(Contact contact) throws Exception {
        DataOut dataOut = new DataOut();
        dataOut.setText1(contact.getBb_id_interaction().toLowerCase());
        dataOut.setText2(contact.getLogin_name().toLowerCase());
        return dataOut;
    }
}
