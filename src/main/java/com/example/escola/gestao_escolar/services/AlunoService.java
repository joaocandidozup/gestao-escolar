package com.example.escola.gestao_escolar.services;

import com.example.escola.gestao_escolar.dtos.AlunoResponseDTO;

import java.util.List;


public interface AlunoService {

    List<AlunoResponseDTO> obterTodosAlunos();
}
