package com.josbar.medisistemas.api.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "\"SignosVitales\"")
public class SignosVitalesEntity {

    @Id
    @Column(name = "id_consulta")
    private Integer idConsulta;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "id_consulta")
    private ConsultaEntity consultaEntity;

    @Column(precision = 5, scale = 2, nullable = false)
    private BigDecimal peso;

    @Column(precision = 5, scale = 2, nullable = false)
    private BigDecimal altura;

    @Column(name = "presion_sistolica", nullable = false)
    private Integer presionSistolica;

    @Column(name = "presion_diastolica", nullable = false)
    private Integer presionDiastolica;

    @Column(precision = 3, scale = 1, nullable = false)
    private BigDecimal temperatura;

    // Getters y setters
}