package com.g.aposta.controller;

import com.g.aposta.model.dto.apostaIn;
import com.g.aposta.model.dto.apostaOut;
import com.g.aposta.service.apostaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class apostaController {

    private final com.g.aposta.service.apostaService apostaService;


    @PostMapping("/aposta")
    public ResponseEntity<apostaOut> salvaAposta(@RequestBody apostaIn apostaIn) {
        apostaOut apostaOut = apostaService.salvaAposta(apostaIn);

        return ResponseEntity.status(HttpStatus.CREATED).body(apostaOut);
    }
}
