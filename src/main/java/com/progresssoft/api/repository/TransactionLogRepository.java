package com.progresssoft.api.repository;

import com.progresssoft.api.dto.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransactionLogRepository extends JpaRepository<TransactionLog, String> {

    TransactionLog findByFileName(String fileName);

}
