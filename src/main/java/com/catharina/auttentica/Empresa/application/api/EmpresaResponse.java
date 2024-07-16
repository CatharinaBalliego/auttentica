package com.catharina.auttentica.Empresa.application.api;

import com.catharina.auttentica.Empresa.domain.Empresa;
import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

    public static List<EmpresaResponse> converte(List<Empresa> empresas){
        return empresas.stream()
                .map(EmpresaResponse::new)
                .collect(Collectors.toList());
    }
}
