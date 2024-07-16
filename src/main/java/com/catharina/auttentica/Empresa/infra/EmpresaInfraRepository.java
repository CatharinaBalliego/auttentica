package com.catharina.auttentica.Empresa.infra;

import com.catharina.auttentica.Empresa.application.repository.EmpresaRepository;
import com.catharina.auttentica.Empresa.domain.Empresa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EmpresaInfraRepository implements EmpresaRepository {

    private final EmpresaSpringDataJPARepository empresaSpringDataJPARepository;
    @Override
    public UUID salvarEmpresa(Empresa empresaRequest) {
        log.info("[start] EmpresaInfraRepository - salvarEmpresa");
        Empresa empresa = empresaSpringDataJPARepository.save(empresaRequest);
        log.info("[finish] EmpresaInfraRepository - salvarEmpresa");
        return empresa.getId();
    }

    @Override
    public Empresa buscarEmpresa(UUID empresaId) {
        log.info("[start] EmpresaInfraRepository - buscarEmpresa");
        Empresa empresa = empresaSpringDataJPARepository.findById(empresaId).orElseThrow();
        log.info("[finish] EmpresaInfraRepository - buscarEmpresa");
        return empresa;
    }
}
