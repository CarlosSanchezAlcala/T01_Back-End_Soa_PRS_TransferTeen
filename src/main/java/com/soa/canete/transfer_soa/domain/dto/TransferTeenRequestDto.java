package com.soa.canete.transfer_soa.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TransferTeenRequestDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 8222253670338491507L;

    @Column
    private Integer id_teen;
    @Column
    private String document_pdf_office;
    @Column
    private LocalDateTime date_hour_register;
    @Column
    private String status;

}
