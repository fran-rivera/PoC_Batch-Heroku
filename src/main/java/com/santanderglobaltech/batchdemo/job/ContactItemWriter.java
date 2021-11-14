package com.santanderglobaltech.batchdemo.job;

import com.santanderglobaltech.batchdemo.domain.Coche;
import com.santanderglobaltech.batchdemo.domain.DataOut;
import com.santanderglobaltech.batchdemo.repository.CocheRepository;
import com.santanderglobaltech.batchdemo.repository.DataOutRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class ContactItemWriter implements ItemWriter<DataOut> {

    @Autowired
    private DataOutRepository dataOutRepository;
    @Autowired
    private CocheRepository cocheRepository;

    @Override
    public void write(List<? extends DataOut> list) throws Exception {
        dataOutRepository.saveAll(list);
        Coche coche = new Coche("General Motors","BMW",3);
        cocheRepository.save(coche);
    }
}
