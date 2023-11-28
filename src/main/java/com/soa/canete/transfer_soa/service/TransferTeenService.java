package com.soa.canete.transfer_soa.service;

import com.soa.canete.transfer_soa.domain.dto.TransferTeenRequestDto;
import com.soa.canete.transfer_soa.domain.dto.TransferTeenResponseDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransferTeenService {

    Flux<TransferTeenResponseDto> findAllDataTransferTeen();

    Mono<TransferTeenResponseDto> saveNewTransferTeen(TransferTeenRequestDto request);
}
