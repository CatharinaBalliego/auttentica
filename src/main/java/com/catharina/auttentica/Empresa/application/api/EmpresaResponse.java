package com.catharina.auttentica.Empresa.application.api;

import com.catharina.auttentica.Empresa.domain.Empresa;
import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
public class EmpresaResponse {
    private UUID empresaId;
    private String nome;
    private String descricao;
    private String imagemLogo;
    private String instagram;
    private String site;

    public EmpresaResponse(Empresa empresa) {
        this.empresaId = empresa.getId();
        this.nome = empresa.getNome();
        this.descricao = empresa.getDescricao();
        this.imagemLogo = empresa.getImagemLogo();
        this.instagram = empresa.getInstagram();
        this.site = empresa.getSite();
    }
}
