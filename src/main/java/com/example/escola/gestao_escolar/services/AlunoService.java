package com.example.escola.gestao_escolar.services;

import com.example.escola.gestao_escolar.dtos.AlunoResponseDTO;
import com.example.escola.gestao_escolar.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<AlunoResponseDTO> buscarTodosAlunos() {
        return alunoRepository.findAll().stream()
                .map(aluno -> new AlunoResponseDTO(
                       aluno.getId(),
                       aluno.getNome(),
                       aluno.getIdade() ))
                .collect(Collectors.toList());

    }
}
