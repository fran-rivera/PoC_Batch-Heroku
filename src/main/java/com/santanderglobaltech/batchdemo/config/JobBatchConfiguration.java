package com.santanderglobaltech.batchdemo.config;

import com.santanderglobaltech.batchdemo.domain.Contact;
import com.santanderglobaltech.batchdemo.domain.DataOut;
import com.santanderglobaltech.batchdemo.job.ContactItemProcessor;
import com.santanderglobaltech.batchdemo.job.ContactItemReader;
import com.santanderglobaltech.batchdemo.job.ContactItemWriter;
import com.santanderglobaltech.batchdemo.listener.ContactItemProcessListener;
import com.santanderglobaltech.batchdemo.listener.ContactItemReaderListener;
import com.santanderglobaltech.batchdemo.listener.ContactItemWriterListener;
import com.santanderglobaltech.batchdemo.listener.ContactJobExecutionListener;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class JobBatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    private ContactItemReader reader;
    @Autowired
    private ContactItemProcessor processor;
    @Autowired
    private ContactItemWriter writer;
    @Autowired
    private JobExecutionListener listener;

    @Bean
    public ContactItemReaderListener readerListener() {
        return new ContactItemReaderListener();
    }

    @Bean
    public ContactItemProcessListener processorListener() {
        return new ContactItemProcessListener();
    }

    @Bean
    public ContactItemWriterListener writerListener() {
        return new ContactItemWriterListener();
    }

    @Bean
    public Job job(Step step, ContactJobExecutionListener jobExecutionListener) {
        Job job = jobBuilderFactory.get("job1")
                .listener(jobExecutionListener)
                .flow(step)
                .end()
                .build();
        return job;
    }

    @Bean
    public Step step(ContactItemReader reader,
                     ContactItemWriter writer,
                     ContactItemProcessor processor,
                     ContactItemReaderListener readerListener,
                     ContactItemProcessListener processorListener,
                     ContactItemWriterListener writerListener) {

        TaskletStep step = stepBuilderFactory.get("step1")
                .<Contact, DataOut>chunk(5)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .listener(readerListener)
                .listener(processorListener)
                .listener(writerListener)
                .build();
        return step;
    }

}
