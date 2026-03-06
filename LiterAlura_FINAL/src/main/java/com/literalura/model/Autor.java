package com.literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer birthYear;

    private Integer deathYear;

    public Autor() {}

    public Autor(String nome, Integer birthYear, Integer deathYear) {
        this.nome = nome;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    @Override
    public String toString() {
        return "Autor: " + nome +
                " (" + birthYear + " - " + deathYear + ")";
    }
}