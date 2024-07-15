package com.catharina.auttentica.Empresa.application.api;

import com.catharina.auttentica.Empresa.application.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@Log4j2
@RestController
@RequiredArgsConstructor
public class EmpresaController implements EmpresaAPI {
    private final EmpresaService empresaService;
    @Override
    public UUID cadastrarEmpresa(CadastrarEmpresaRequest request) {
        log.info("[start] EmpresaController - cadastrarEmpresa");
        UUID empresaId = empresaService.cadastrarEmpresa(request);
        log.info("[finish] EmpresaController - cadastrarEmpresa");
        return empresaId;
    }
}
