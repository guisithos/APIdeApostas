package com.g.aposta.controller;

import com.g.aposta.model.dto.apostadorIn;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RestController
public class apostadorController {
    private final com.g.aposta.service.apostadorService apostadorService;
    @PostMapping("/apostador")
    public ResponseEntity salvarApostador(@RequestBody apostadorIn apostadorIn) {

        apostadorService.salvaApostador(apostadorIn);
        return ResponseEntity.status(CREATED).build();
    }
}
