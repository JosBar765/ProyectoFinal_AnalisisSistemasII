package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.auditoria.AuditoriaConsultaResponseDTO;
import com.josbar.medisistemas.api.domain.entities.AuditoriaConsultaEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class AuditoriaConsultaMapper implements Mapper<AuditoriaConsultaEntity, Void, AuditoriaConsultaResponseDTO> {

    @Override
    public AuditoriaConsultaEntity toEntity(Void request) {
        throw new UnsupportedOperationException("Las auditorías son inmutables y no se crean desde un Request");
    }

    @Override
    public AuditoriaConsultaResponseDTO toResponse(AuditoriaConsultaEntity entity) {
        // Mapeo similar al de documento, extrayendo los IDs y copiando los textos clínicos anteriores y nuevos
        // (motivoConsultaAnterior, motivoConsultaNuevo, etc).
        if(entity == null) return null;
        AuditoriaConsultaResponseDTO dto = new AuditoriaConsultaResponseDTO();
        dto.setId(entity.getId());
        dto.setIdConsulta(
                entity.getConsultaEntity() != null
                        ? entity.getConsultaEntity().getId()
                        : null
        );
        // ... seteo de campos clínicos ...
        dto.setFechaModificacion(entity.getFechaModificacion());
        return dto;
    }
}