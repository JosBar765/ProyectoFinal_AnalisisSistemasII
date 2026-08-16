package com.josbar.medisistemas.api.domain.dtos.documento;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentoResponseDTO {
    private Integer id;

    private Integer idPaciente;

    private CatalogoResponseDTO categoriaDocumentoResponseDTO;

    private String nombre;
    private String url;

    private LocalDateTime fechaCarga;

    private Integer idUsuarioCarga;
}
