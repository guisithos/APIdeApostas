package com.g.aposta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class aposta {

    @Id
    private String numeroAposta;

    @ManyToOne
    @JoinColumn(name = "idApostador", nullable = false)
    private apostador apostador;

}
