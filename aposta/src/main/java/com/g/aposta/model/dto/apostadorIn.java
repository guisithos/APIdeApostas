package com.g.aposta.model.dto;

import com.g.aposta.model.apostador;

public class apostadorIn {

    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public apostador toConvert() {
        return new apostador(nome, email);
    }
}


