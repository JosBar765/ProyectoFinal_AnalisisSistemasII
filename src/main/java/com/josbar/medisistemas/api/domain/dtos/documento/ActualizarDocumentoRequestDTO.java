package com.josbar.medisistemas.api.domain.dtos.documento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActualizarDocumentoRequestDTO {
    private Integer idMotivoModificacion;

    private String nombre;
    private String url;
}
