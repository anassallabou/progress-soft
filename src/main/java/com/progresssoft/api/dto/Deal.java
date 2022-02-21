package com.progresssoft.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@ToString
public class Deal {
    @Id
    @Column(name = "dealId", nullable = false, unique = true)
    private String dealId;

    @Column(name = "file_name")
    private String fileName;

    public Deal() {
        this.dealId = UUID.randomUUID().toString();
    }

}
