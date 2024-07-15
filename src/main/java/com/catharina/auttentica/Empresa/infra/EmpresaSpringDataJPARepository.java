package com.catharina.auttentica.Empresa.infra;

import com.catharina.auttentica.Empresa.domain.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmpresaSpringDataJPARepository extends JpaRepository<Empresa, UUID> {
}
