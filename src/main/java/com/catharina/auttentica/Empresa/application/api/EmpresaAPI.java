package com.catharina.auttentica.Empresa.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/empresa")
public interface EmpresaAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UUID cadastrarEmpresa(@RequestBody @Valid CadastrarEmpresaRequest request);

    @GetMapping("/{empresaId}")
    @ResponseStatus(code = HttpStatus.OK)
    EmpresaResponse buscarEmpresa(@PathVariable UUID empresaId);
}
