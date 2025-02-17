package com.example.escola.gestao_escolar.controllers;

import com.example.escola.gestao_escolar.dtos.AlunoResponseDTO;
import com.example.escola.gestao_escolar.services.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ResponseEntity<List<AlunoResponseDTO>> listarTodos() {
        List<AlunoResponseDTO> listaDeAlunos = alunoService.obterTodosAlunos();
        return ResponseEntity.ok(listaDeAlunos);
    }
}
