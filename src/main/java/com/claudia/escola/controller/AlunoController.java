package com.claudia.escola.controller;

import com.claudia.escola.dto.AlunoDto;
import com.claudia.escola.modelo.Aluno;
import com.claudia.escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/alunos")

public class AlunoController {
        @Autowired
        private AlunoRepository alunoRepository;
//
//        @Autowired
//        private CursoRepository cursoRepository;

        @GetMapping("/{nome}")
        public List<AlunoDto> list(@PathVariable String nome) {
            if (nome == null) {
                List<Aluno> alunos = alunoRepository.findAll();
                return AlunoDto.converter(alunos);
            } else {
                List<Aluno> alunos = alunoRepository.findByNome(nome);
                return AlunoDto.converter(alunos);
            }

        }
}
