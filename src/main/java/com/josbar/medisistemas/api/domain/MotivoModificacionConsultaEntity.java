package com.josbar.medisistemas.api.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "\"MotivoModificacionConsulta\"")
public class MotivoModificacionConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "motivo_modificacion", length = 50, nullable = false)
    private String motivoModificacion;

    @Column(name = "detalle_motivo")
    private String detalleMotivo;
}