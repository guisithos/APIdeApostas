package com.g.aposta.service;

import com.g.aposta.model.aposta;
import com.g.aposta.model.apostador;
import com.g.aposta.model.dto.apostaIn;
import com.g.aposta.model.dto.apostaOut;
import com.g.aposta.model.dto.apostasOut;
import com.g.aposta.repository.apostaRepository;
import com.g.aposta.repository.apostadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class apostaService {

    private final apostadorRepository apostadorRepository;
    private final apostaRepository apostaRepository;
    public apostaOut salvaAposta(apostaIn apostaIn) {
        Optional<apostador> apostador = apostadorRepository.findById(apostaIn.getIdApostador());
        String numAposta = UUID.randomUUID().toString();
        aposta aposta = new aposta(numAposta, apostador.get());

        apostaRepository.save(aposta);

        return new apostaOut(numAposta, apostador.get().getNome(), apostador.get().getEmail());
    }

    public List<apostasOut> buscaApostasPorIDApostador(Long idApostador) {
        List<aposta> apostaList = apostaRepository.findByIDApostador(idApostador);
        List<apostasOut> list = new ArrayList<>();

        apostaList.forEach(apostas -> {
            apostasOut apostasOut = new apostasOut();
            apostasOut.setIdApostador(apostas.getApostador().getId());
            apostasOut.setNumeroAposta(apostas.getNumeroAposta());
            list.add(apostasOut);
        });

        return list;
    }
}
