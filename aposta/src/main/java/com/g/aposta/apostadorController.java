package com.g.aposta;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class apostadorController {

    private final apostadorRepository apostadorRepository;

    public apostadorController(com.g.aposta.apostadorRepository apostadorRepository) {
        this.apostadorRepository = apostadorRepository;
    }


    @PostMapping("/apostador")
    public ResponseEntity salvarApostador(@RequestBody apostadorIn apostadorIn) {
        System.out.println("Apostador: " + apostadorIn);

        apostador apostador = apostadorIn.toConvert();
        apostadorRepository.save(apostador);

        return ResponseEntity.status(CREATED).build();
    }
}
