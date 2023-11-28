package com.soa.canete.transfer_soa.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table(name = "transfer_data_teen")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferTeen {

    @Id
    private Integer id_transferdatateen;
    @Column
    private Integer id_teen;
    @Column
    private String document_pdf_office;
    @Column
    private LocalDateTime date_hour_register;
    @Column
    private String status;

    public TransferTeen(Integer id_teen, String document_pdf_office,
                        LocalDateTime date_hour_register, String status) {
        this.id_teen = id_teen;
        this.document_pdf_office = document_pdf_office;
        this.date_hour_register = date_hour_register;
        this.status = status;
    }
}
