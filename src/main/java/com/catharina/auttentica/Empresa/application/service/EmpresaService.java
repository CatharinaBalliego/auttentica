package com.catharina.auttentica.Empresa.application.service;


import com.catharina.auttentica.Empresa.application.api.EmpresaRequest;
import com.catharina.auttentica.Empresa.application.api.EmpresaResponse;

import java.util.List;
import java.util.UUID;


public interface EmpresaService {

    UUID cadastrarEmpresa(EmpresaRequest empresa);

    EmpresaResponse buscarEmpresaId(UUID empresaId);

    List<EmpresaResponse> listarEmpresas();

    EmpresaResponse atualizar(UUID empresaId, EmpresaRequest request);
}
