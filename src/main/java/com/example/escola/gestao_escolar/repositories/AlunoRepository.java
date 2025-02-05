package com.example.escola.gestao_escolar.repositories;

import com.example.escola.gestao_escolar.models.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
}
