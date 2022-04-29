package com.g.aposta.service;

import com.g.aposta.model.apostador;
import com.g.aposta.model.dto.apostadorIn;
import com.g.aposta.repository.apostadorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class apostadorService {
        private final com.g.aposta.repository.apostadorRepository apostadorRepository;
        private final ModelMapper modelMapper;


        public void salvaApostador(apostadorIn apostadorIn) {
                apostador apostador = modelMapper.map(apostadorIn, apostador.class);
                apostadorRepository.save(apostador);
        }
}
