package com.catharina.auttentica.Produto.domain;

import com.catharina.auttentica.Empresa.domain.Empresa;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "produto_tb")
@Getter
@NoArgsConstructor(access =  AccessLevel.PRIVATE)
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String descricao;
    @Column(columnDefinition = "TEXT")
    private String imagem;
    @Column(columnDefinition = "TEXT")
    private String url;
    private String composicao;
    @Column(name = "data_cadastro")
    private Date dataCadastro;



    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;

}
