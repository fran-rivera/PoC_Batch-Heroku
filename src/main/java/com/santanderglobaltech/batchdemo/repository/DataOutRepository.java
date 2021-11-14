package com.santanderglobaltech.batchdemo.repository;

import com.santanderglobaltech.batchdemo.domain.DataOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataOutRepository extends JpaRepository<DataOut,Long> {
}
