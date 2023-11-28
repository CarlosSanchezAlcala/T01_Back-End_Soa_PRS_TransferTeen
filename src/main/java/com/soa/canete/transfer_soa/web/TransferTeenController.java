package com.soa.canete.transfer_soa.web;

import com.soa.canete.transfer_soa.domain.dto.TransferTeenRequestDto;
import com.soa.canete.transfer_soa.domain.dto.TransferTeenResponseDto;
import com.soa.canete.transfer_soa.service.TransferTeenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/transferTeen")
@RequiredArgsConstructor
public class TransferTeenController {

    final TransferTeenService transferTeenService;

    @GetMapping("/listData")
    public Flux<TransferTeenResponseDto> getDataCompleteTransferTeen() {
        return this.transferTeenService.findAllDataTransferTeen();
    }

    @PostMapping
    public Mono<TransferTeenResponseDto> saveNewTransferTeen(@RequestBody TransferTeenRequestDto dto) {
        return this.transferTeenService.saveNewTransferTeen(dto);
    }

}
