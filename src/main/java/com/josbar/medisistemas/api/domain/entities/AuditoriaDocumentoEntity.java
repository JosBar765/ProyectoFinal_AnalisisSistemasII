package com.josbar.medisistemas.api.domain.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"AuditoriaDocumento\"")
public class AuditoriaDocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_documento", nullable = false)
    private DocumentoEntity documentoEntity;

    @Column(name = "nombre_anterior", length = 255, nullable = false)
    private String nombreAnterior;

    @Column(name = "url_anterior", length = 500)
    private String urlAnterior;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private UsuarioEntity usuarioEntity;

    @Column(name = "fecha_modificacion", nullable = false)
    private LocalDateTime fechaModificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_motivo_modificacion", nullable = false)
    private MotivoModificacionDocumentoEntity motivoModificacionDocumentoEntity;

    @Column(name = "nombre_nuevo", length = 255, nullable = false)
    private String nombreNuevo;

    @Column(name = "url_nuevo", length = 500)
    private String urlNuevo;
}