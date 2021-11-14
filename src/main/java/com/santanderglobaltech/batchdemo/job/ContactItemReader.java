package com.santanderglobaltech.batchdemo.job;

import com.santanderglobaltech.batchdemo.domain.Contact;
import com.santanderglobaltech.batchdemo.repository.ContactRepository;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class ContactItemReader implements ItemReader<Contact>{

    @Autowired
    private ContactRepository respository;

    private Iterator<Contact> usersIterator;

    @BeforeStep
    public void before(StepExecution stepExecution) {
        usersIterator = respository.findAll().iterator();
    }

    @Override
    public Contact read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (usersIterator != null && usersIterator.hasNext()) {
            return usersIterator.next();
        } else {
            return null;
        }
    }
}
