package com.catharina.auttentica.Empresa.application.api;

import com.catharina.auttentica.Empresa.application.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@Log4j2
@RestController
@RequiredArgsConstructor
public class EmpresaController implements EmpresaAPI {
    private final EmpresaService empresaService;
    @Override
    public UUID cadastrarEmpresa(EmpresaRequest request) {
        log.info("[start] EmpresaController - cadastrarEmpresa");
        UUID empresaId = empresaService.cadastrarEmpresa(request);
        log.info("[finish] EmpresaController - cadastrarEmpresa");
        return empresaId;
    }

    @Override
    public EmpresaResponse buscarEmpresa(UUID empresaId) {
        log.info("[start] EmpresaController - buscarEmpresa");
        EmpresaResponse empresa = empresaService.buscarEmpresaId(empresaId);
        log.info("[finish] EmpresaController - buscarEmpresa");
        return empresa;
    }

    @Override
    public List<EmpresaResponse> listarEmpresas() {
        log.info("[start] EmpresaController - listarEmpresas");
        List<EmpresaResponse> empresaResponseList = empresaService.listarEmpresas();
        log.info("[finish] EmpresaController - listarEmpresas");
        return empresaResponseList;
    }

    @Override
    public EmpresaResponse atualizarEmpresa(UUID empresaId, EmpresaRequest request) {
        log.info("[start] EmpresaController - atualizarEmpresa");
        EmpresaResponse empresa = empresaService.atualizar(empresaId, request);
        log.info("[finish] EmpresaController - atualizarEmpresa");
        return empresa;
    }
}
