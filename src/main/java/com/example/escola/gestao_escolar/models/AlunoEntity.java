package com.example.escola.gestao_escolar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class AlunoEntity {
    @Id
    private Long id;
    private String nome;
    int idade;

    public AlunoEntity() {
    }

    public AlunoEntity(Long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
