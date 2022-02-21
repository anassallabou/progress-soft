package com.progresssoft.api.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transaction_log")
@Getter
@Setter
public class TransactionLog {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "deals_imported_count")
    private int dealsImportedCount = 0;

    @Column(name = "invalid_deals_imported_count")
    private int invalidDealsImportedCount = 0;

    @Column(name = "process_duration")
    private double processDuration;

    public TransactionLog() {
        this.dateTime = LocalDateTime.now(Clock.systemUTC());
        this.id = UUID.randomUUID().toString();
    }

    public TransactionLog(String fileName) {
        this();
        this.fileName = fileName;

    }
}
