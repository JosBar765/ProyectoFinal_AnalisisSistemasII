package com.josbar.medisistemas.api.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"AuditoriaConsulta\"")
public class AuditoriaConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_consulta", nullable = false)
    private ConsultaEntity consultaEntity;

    @Column(name = "motivo_consulta_anterior")
    private String motivoConsultaAnterior;

    @Column(name = "diagnostico_anterior")
    private String diagnosticoAnterior;

    @Column(name = "tratamiento_anterior")
    private String tratamientoAnterior;

    @Column(name = "observaciones_anterior")
    private String observacionesAnterior;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private UsuarioEntity usuarioEntity;

    @Column(name = "fecha_modificacion", nullable = false)
    private LocalDateTime fechaModificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_motivo_modificacion", nullable = false)
    private MotivoModificacionConsultaEntity motivoModificacionConsultaEntity;

    @Column(name = "motivo_consulta_nuevo")
    private String motivoConsultaNuevo;

    @Column(name = "diagnostico_nuevo")
    private String diagnosticoNuevo;

    @Column(name = "tratamiento_nuevo")
    private String tratamientoNuevo;

    @Column(name = "observaciones_nuevo")
    private String observacionesNuevo;

    // Getters y setters
}