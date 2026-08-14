package com.josbar.medisistemas.api.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "\"CategoriaDocumento\"")
public class CategoriaDocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "categoria_documento", length = 100, nullable = false)
    private String categoriaDocumento;
}