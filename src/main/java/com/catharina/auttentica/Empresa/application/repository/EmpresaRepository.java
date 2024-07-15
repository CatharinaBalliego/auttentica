package com.catharina.auttentica.Empresa.application.repository;

import com.catharina.auttentica.Empresa.domain.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmpresaRepository {

    UUID salvarEmpresa(Empresa empresa);
}
