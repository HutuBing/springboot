package com.sblearn.task.repository;

import com.sblearn.task.entity.CronEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface CronRepository extends JpaRepository<CronEntity, String> {
}
