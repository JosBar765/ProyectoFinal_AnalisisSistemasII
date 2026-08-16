package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteResponseDTO;
import com.josbar.medisistemas.api.domain.entities.PacienteEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class PacienteMapper implements Mapper<PacienteEntity, PacienteRequestDTO, PacienteResponseDTO> {

    @Override
    public PacienteEntity toEntity(PacienteRequestDTO request) {
        if(request == null) return null;
        PacienteEntity entity = new PacienteEntity();
        entity.setDpi(request.getDpi());
        entity.setPrimerNombre(request.getPrimerNombre());
        entity.setSegundoNombre(request.getSegundoNombre());
        entity.setPrimerApellido(request.getPrimerApellido());
        entity.setSegundoApellido(request.getSegundoApellido());
        entity.setTelefono(request.getTelefono());
        entity.setDireccion(request.getDireccion());
        entity.setFechaNacimiento(request.getFechaNacimiento());
        entity.setEstado(request.getEstado());
        return entity;
    }

    @Override
    public PacienteResponseDTO toResponse(PacienteEntity entity) {
        if(entity == null) return null;
        PacienteResponseDTO dto = new PacienteResponseDTO();
        dto.setId(entity.getId());
        dto.setDpi(entity.getDpi());
        dto.setPrimerNombre(entity.getPrimerNombre());
        dto.setSegundoNombre(entity.getSegundoNombre());
        dto.setPrimerApellido(entity.getPrimerApellido());
        dto.setSegundoApellido(entity.getSegundoApellido());
        dto.setTelefono(entity.getTelefono());
        dto.setDireccion(entity.getDireccion());
        dto.setFechaNacimiento(entity.getFechaNacimiento());
        dto.setEstado(entity.getEstado());
        return dto;
    }
}