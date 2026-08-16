package com.josbar.medisistemas.api.domain.dtos.expediente_clinico;

import com.josbar.medisistemas.api.domain.dtos.consulta.ConsultaResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.documento.DocumentoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpedienteClinicoResponseDTO {
    private PacienteResponseDTO pacienteResponseDTO;

    private List<ConsultaResponseDTO> historialConsultasResponseDTO;

    private List<DocumentoResponseDTO> documentosClinicosResponseDTO;
}
