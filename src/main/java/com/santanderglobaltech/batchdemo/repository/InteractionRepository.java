package com.santanderglobaltech.batchdemo.repository;

import com.santanderglobaltech.batchdemo.domain.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteractionRepository extends JpaRepository<Interaction,Long> {
}
