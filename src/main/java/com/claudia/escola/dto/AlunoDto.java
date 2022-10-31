package com.claudia.escola.dto;

import com.claudia.escola.modelo.Aluno;

import java.util.List;
import java.util.stream.Collectors;

public class AlunoDto {

    private long id;
    private String nome;
    private int idade;
    private String email;

    public AlunoDto(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.idade = aluno.getIdade();
        this.email = aluno.getEmail();
    }

    public static List<AlunoDto> converter(List<Aluno> alunos) {
        return alunos.stream().map(AlunoDto::new).collect(Collectors.toList());
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }
}
