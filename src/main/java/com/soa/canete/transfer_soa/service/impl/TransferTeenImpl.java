package com.soa.canete.transfer_soa.service.impl;

import com.soa.canete.transfer_soa.domain.dto.TransferTeenRequestDto;
import com.soa.canete.transfer_soa.domain.dto.TransferTeenResponseDto;
import com.soa.canete.transfer_soa.domain.mapper.TransferTeenMapper;
import com.soa.canete.transfer_soa.domain.model.TransferTeen;
import com.soa.canete.transfer_soa.repository.TransferTeenRepository;
import com.soa.canete.transfer_soa.service.TransferTeenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Comparator;

import static com.soa.canete.transfer_soa.domain.mapper.TransferTeenMapper.toModel;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransferTeenImpl implements TransferTeenService {

    final TransferTeenRepository transferTeenRepository;

    @Override
    public Flux<TransferTeenResponseDto> findAllDataTransferTeen() {
        return this.transferTeenRepository.findAll()
                .sort(Comparator.comparing(TransferTeen::getId_transferdatateen).reversed())
                .map(TransferTeenMapper::toDto);
    }

    @Override
    public Mono<TransferTeenResponseDto> saveNewTransferTeen(TransferTeenRequestDto request) {
        return this.transferTeenRepository.save(toModel(request))
                .map(TransferTeenMapper::toDto);
    }
}
