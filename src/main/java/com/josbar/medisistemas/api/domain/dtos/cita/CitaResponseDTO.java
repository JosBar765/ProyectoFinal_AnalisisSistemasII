package com.josbar.medisistemas.api.domain.dtos.cita;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.medico.MedicoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CitaResponseDTO {
    private Integer id;
    private MedicoResponseDTO medicoDTO;
    private PacienteResponseDTO pacienteDTO;
    private CatalogoResponseDTO estadoCitaDTO;
    private LocalDate fecha;
    private LocalTime hora;
}
