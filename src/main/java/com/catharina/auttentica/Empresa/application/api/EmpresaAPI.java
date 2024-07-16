package com.catharina.auttentica.Empresa.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/empresa")
public interface EmpresaAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UUID cadastrarEmpresa(@RequestBody @Valid EmpresaRequest request);

    @GetMapping("/{empresaId}")
    @ResponseStatus(code = HttpStatus.OK)
    EmpresaResponse buscarEmpresa(@PathVariable UUID empresaId);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<EmpresaResponse> listarEmpresas();

    @PatchMapping("/{empresaId}")
    @ResponseStatus(code = HttpStatus.OK)
    EmpresaResponse atualizarEmpresa(@PathVariable UUID empresaId, @RequestBody @Valid EmpresaRequest request);
}
