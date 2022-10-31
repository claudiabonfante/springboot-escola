package com.claudia.escola.repository;

import com.claudia.escola.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, String> {
    List<Aluno> findByNome(String nome);
}
