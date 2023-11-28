package com.soa.canete.transfer_soa.domain.mapper;

import com.soa.canete.transfer_soa.domain.dto.TransferTeenRequestDto;
import com.soa.canete.transfer_soa.domain.dto.TransferTeenResponseDto;
import com.soa.canete.transfer_soa.domain.model.TransferTeen;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TransferTeenMapper {

    public static TransferTeen toModel(TransferTeenRequestDto dto) {
        return new TransferTeen(
                dto.getId_teen(),
                dto.getDocument_pdf_office(),
                dto.getDate_hour_register(),
                dto.getStatus()
        );
    }

    public static TransferTeen toModel(TransferTeenRequestDto dto, Integer id_transferdatateen) {
        return new TransferTeen(
                id_transferdatateen,
                dto.getId_teen(),
                dto.getDocument_pdf_office(),
                dto.getDate_hour_register(),
                dto.getStatus()
        );
    }

    public static TransferTeenResponseDto toDto(TransferTeen model) {
        return new TransferTeenResponseDto(
                model.getId_transferdatateen(),
                model.getId_teen(),
                model.getDocument_pdf_office(),
                model.getDate_hour_register(),
                model.getStatus()
        );
    }

}
