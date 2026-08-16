package com.josbar.medisistemas.api.domain.dtos.documento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubirDocumentoRequestDTO {
    private Integer idPaciente;
    private Integer idCategoriaDocumento;

    private String nombre;
    private String url;
}
