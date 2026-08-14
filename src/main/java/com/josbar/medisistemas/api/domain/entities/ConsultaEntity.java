package com.josbar.medisistemas.api.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Consulta\"")
public class ConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cita", nullable = false, unique = true)
    private CitaEntity citaEntity;

    @Column(name = "motivo_consulta")
    private String motivoConsulta;

    @Column
    private String diagnostico;

    @Column
    private String tratamiento;

    @Column
    private String observaciones;

    // Getters y setters
}