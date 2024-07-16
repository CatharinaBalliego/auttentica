package com.catharina.auttentica.Empresa.application.service;


import com.catharina.auttentica.Empresa.application.api.CadastrarEmpresaRequest;
import com.catharina.auttentica.Empresa.application.api.EmpresaResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface EmpresaService {

    UUID cadastrarEmpresa(CadastrarEmpresaRequest empresa);

    EmpresaResponse buscarEmpresaId(UUID empresaId);
}
