package com.josbar.medisistemas.api.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"Documento\"")
public class DocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", nullable = false)
    private PacienteEntity pacienteEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria_documento", nullable = false)
    private CategoriaDocumentoEntity categoriaDocumentoEntity;

    @Column(length = 255, nullable = false)
    private String nombre;

    @Column(length = 500, nullable = false)
    private String url;

    @Column(name = "fecha_carga", nullable = false)
    private LocalDateTime fechaCarga;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario_carga", nullable = false)
    private UsuarioEntity usuarioEntityCarga;

    // Getters y setters
}