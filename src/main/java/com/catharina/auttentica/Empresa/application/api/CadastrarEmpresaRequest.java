package com.catharina.auttentica.Empresa.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class CadastrarEmpresaRequest {
    @NotBlank
    @Size(message = "Campo nome não pode estar vazio!", max = 100)
    private String nome;
    @NotBlank
    @Size(message = "Campo descricao não pode estar vazio!", max = 255)
    private String descricao;
    @NotNull
    private String imagemLogo;
    @Size(message = "Campo nome não pode estar vazio!", max = 30)
    private String instagram;
    private String site;

}
