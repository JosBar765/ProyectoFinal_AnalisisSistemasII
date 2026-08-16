package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.catalogo.CatalogoResponseDTO;
import com.josbar.medisistemas.api.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class CatalogoMapper implements Mapper<Object, CatalogoRequestDTO, CatalogoResponseDTO> {
    // Nota: Como los catálogos (Rol, Especialidad, etc) comparten la misma estructura base (id, nombre),
    // puedes tener este genérico o usar interfaces base en tus entidades.
    // Aquí implementado asumiendo un objeto que tiene getId y getNombre por reflexión o casting.

    @Override
    public Object toEntity(CatalogoRequestDTO request) {
        throw new UnsupportedOperationException("Implementar instanciación específica en Service");
    }

    @Override
    public CatalogoResponseDTO toResponse(Object entity) {
        if (entity == null) return null;

        CatalogoResponseDTO dto = new CatalogoResponseDTO();
        // Lógica de mapeo genérica para obtener Id y Nombre.
        return dto;
    }
}