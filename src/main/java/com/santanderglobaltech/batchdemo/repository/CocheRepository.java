package com.santanderglobaltech.batchdemo.repository;

import com.santanderglobaltech.batchdemo.domain.Coche;
import com.santanderglobaltech.batchdemo.domain.DataOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche,Long> {
}
