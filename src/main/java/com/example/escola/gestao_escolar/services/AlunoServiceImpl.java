package com.example.escola.gestao_escolar.services;

import com.example.escola.gestao_escolar.dtos.AlunoResponseDTO;
import com.example.escola.gestao_escolar.models.AlunoEntity;
import com.example.escola.gestao_escolar.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoServiceImpl implements AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<AlunoResponseDTO> obterTodosAlunos() {
        return alunoRepository.findAll().stream()
                .map(this::mapearParaAlunoResponseDTO)
                .collect(Collectors.toList());
    }

    private AlunoResponseDTO mapearParaAlunoResponseDTO(AlunoEntity aluno) {
        return new AlunoResponseDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getIdade()
        );
    }
}
