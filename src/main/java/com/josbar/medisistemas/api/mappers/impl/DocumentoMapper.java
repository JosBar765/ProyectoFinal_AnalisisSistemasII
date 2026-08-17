package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.documento.ActualizarDocumentoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.documento.DocumentoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.documento.SubirDocumentoRequestDTO;
import com.josbar.medisistemas.api.domain.entities.CategoriaDocumentoEntity;
import com.josbar.medisistemas.api.domain.entities.DocumentoEntity;
import com.josbar.medisistemas.api.domain.entities.PacienteEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DocumentoMapper implements Mapper<DocumentoEntity, SubirDocumentoRequestDTO, DocumentoResponseDTO> {

    private final CatalogoMapper catalogoMapper;

    @Override
    public DocumentoEntity toEntity(SubirDocumentoRequestDTO request) {
        if(request == null) return null;
        DocumentoEntity entity = new DocumentoEntity();

        PacienteEntity paciente = new PacienteEntity();
        paciente.setId(request.getIdPaciente());
        entity.setPacienteEntity(paciente);

        CategoriaDocumentoEntity categoria = new CategoriaDocumentoEntity();
        categoria.setId(request.getIdCategoriaDocumento());
        entity.setCategoriaDocumentoEntity(categoria);

        entity.setNombre(request.getNombre());
        entity.setUrl(request.getUrl());

        // Nota Arquitectónica: idUsuarioCarga se saca del JWT en el Service, NO del Request.
        return entity;
    }

    @Override
    public DocumentoResponseDTO toResponse(DocumentoEntity entity) {
        if(entity == null) return null;
        DocumentoResponseDTO dto = new DocumentoResponseDTO();
        dto.setId(entity.getId());
        dto.setIdPaciente(entity.getPacienteEntity() != null ? entity.getPacienteEntity().getId() : null);
        dto.setIdUsuarioCarga(entity.getUsuarioEntityCarga() != null ? entity.getUsuarioEntityCarga().getId() : null);
        dto.setNombre(entity.getNombre());
        dto.setUrl(entity.getUrl());
        dto.setFechaCarga(entity.getFechaCarga());
        dto.setCategoriaDocumentoResponseDTO(catalogoMapper.toResponse(entity.getCategoriaDocumentoEntity()));
        return dto;
    }

    public void updateEntity(ActualizarDocumentoRequestDTO request, DocumentoEntity entity) {
        if (request == null || entity == null) return;

        if (request.getNombre() != null && !request.getNombre().trim().isEmpty()) {
            entity.setNombre(request.getNombre());
        }
        if (request.getUrl() != null && !request.getUrl().trim().isEmpty()) {
            entity.setUrl(request.getUrl());
        }
    }
}