package com.catharina.auttentica.Empresa.application.service;

import com.catharina.auttentica.Empresa.application.api.CadastrarEmpresaRequest;
import com.catharina.auttentica.Empresa.application.api.EmpresaResponse;
import com.catharina.auttentica.Empresa.application.repository.EmpresaRepository;
import com.catharina.auttentica.Empresa.domain.Empresa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class EmpresaApplicationService implements EmpresaService {

    private final EmpresaRepository empresaRepository;
    @Override
    public UUID cadastrarEmpresa(CadastrarEmpresaRequest empresa) {
        log.info("[start] EmpresaApplicationService - cadastrarEmpresa");
        UUID idEmpresa = empresaRepository.salvarEmpresa(new Empresa(empresa));
        log.info("[empresaId] Created - {}", idEmpresa);
        log.info("[finish] EmpresaApplicationService - cadastrarEmpresa");
        return idEmpresa;
    }

    @Override
    public EmpresaResponse buscarEmpresaId(UUID empresaId) {
        log.info("[start] EmpresaApplicationService - buscarEmpresaId");
        Empresa empresa = empresaRepository.buscarEmpresa(empresaId);
        log.info("[finish] EmpresaApplicationService - buscarEmpresaId");
        return new EmpresaResponse(empresa);
    }
}
