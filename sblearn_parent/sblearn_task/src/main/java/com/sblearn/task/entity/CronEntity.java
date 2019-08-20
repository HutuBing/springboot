package com.sblearn.task.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "t_cron")
public class CronEntity {

    @Id
    private String id;
    private String cron;

}
