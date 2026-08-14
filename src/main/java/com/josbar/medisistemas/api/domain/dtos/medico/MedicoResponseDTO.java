package com.josbar.medisistemas.api.domain.dtos.medico;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.usuario.UsuarioResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicoResponseDTO {
    private Integer id;
    private UsuarioResponseDTO usuarioDTO;
    private CatalogoResponseDTO especialidadDTO;
    private String colegiado;
}