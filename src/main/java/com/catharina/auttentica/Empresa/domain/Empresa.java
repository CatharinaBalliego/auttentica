package com.catharina.auttentica.Empresa.domain;

import com.catharina.auttentica.Empresa.application.api.CadastrarEmpresaRequest;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "empresa_tb")
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empresa_id")
    private UUID id;
    private String nome;
    private String descricao;
    @Column(columnDefinition = "TEXT", name = "imagem_logo")
    private String imagemLogo;
    private String instagram;
    private String site;
    @Column(name = "data_cadastro")
    private Date dataCadastro;


    public Empresa(CadastrarEmpresaRequest request) {
        this.id = UUID.randomUUID();
        this.nome = request.getNome();
        this.descricao = request.getDescricao();
        this.imagemLogo = request.getImagemLogo();
        this.instagram = request.getInstagram();
        this.site = request.getSite();
        this.dataCadastro = Date.valueOf(LocalDate.now());
    }
}
