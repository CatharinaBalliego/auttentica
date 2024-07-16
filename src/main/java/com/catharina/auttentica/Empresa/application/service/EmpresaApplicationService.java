package com.catharina.auttentica.Empresa.application.service;

import com.catharina.auttentica.Empresa.application.api.EmpresaRequest;
import com.catharina.auttentica.Empresa.application.api.EmpresaResponse;
import com.catharina.auttentica.Empresa.application.repository.EmpresaRepository;
import com.catharina.auttentica.Empresa.domain.Empresa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class EmpresaApplicationService implements EmpresaService {

    private final EmpresaRepository empresaRepository;
    @Override
    public UUID cadastrarEmpresa(EmpresaRequest empresa) {
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

    @Override
    public List<EmpresaResponse> listarEmpresas() {
        log.info("[start] EmpresaApplicationService - listarEmpresas");
        List<Empresa> empresas = empresaRepository.listarEmpresas();
        log.info("[finish] EmpresaApplicationService - listarEmpresas");
        return EmpresaResponse.converte(empresas);
    }

    @Override
    public EmpresaResponse atualizar(UUID empresaId, EmpresaRequest request) {
        log.info("[start] EmpresaApplicationService - atualizar");
        Empresa empresa = empresaRepository.buscarEmpresa(empresaId);
        empresa.atualizar(request);
        empresaRepository.salvarEmpresa(empresa);
        log.info("[finish] EmpresaApplicationService - atualizar");
        return new EmpresaResponse(empresa);
    }
}
