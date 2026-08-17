package com.josbar.medisistemas.api.mappers.impl;

import com.josbar.medisistemas.api.domain.dtos.usuario.UsuarioRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.usuario.UsuarioResponseDTO;
import com.josbar.medisistemas.api.domain.entities.RolEntity;
import com.josbar.medisistemas.api.domain.entities.UsuarioEntity;
import com.josbar.medisistemas.api.mappers.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioMapper implements Mapper<UsuarioEntity, UsuarioRequestDTO, UsuarioResponseDTO> {

    private final CatalogoMapper catalogoMapper; // Asumiendo que sabe mapear un Rol

    @Override
    public UsuarioEntity toEntity(UsuarioRequestDTO request) {
        if (request == null) return null;

        UsuarioEntity entity = new UsuarioEntity();
        RolEntity rolEntity = new RolEntity();
        rolEntity.setId(request.getIdRol());
        entity.setRolEntity(rolEntity);

        entity.setPrimerNombre(request.getPrimerNombre());
        entity.setSegundoNombre(request.getSegundoNombre());
        entity.setPrimerApellido(request.getPrimerApellido());
        entity.setSegundoApellido(request.getSegundoApellido());
        entity.setCorreo(request.getCorreo());
        entity.setTelefono(request.getTelefono());
        entity.setContrasenia(request.getContrasenia());
        entity.setEstado(request.getEstado());

        return entity;
    }

    @Override
    public UsuarioResponseDTO toResponse(UsuarioEntity entity) {
        if (entity == null) return null;

        UsuarioResponseDTO response = new UsuarioResponseDTO();
        response.setId(entity.getId());
        response.setPrimerNombre(entity.getPrimerNombre());
        response.setSegundoNombre(entity.getSegundoNombre());
        response.setPrimerApellido(entity.getPrimerApellido());
        response.setSegundoApellido(entity.getSegundoApellido());
        response.setCorreo(entity.getCorreo());
        response.setTelefono(entity.getTelefono());
        response.setEstado(entity.getEstado());
        response.setFechaCreacion(entity.getFechaCreacion());
        response.setRol(catalogoMapper.toResponse(entity.getRolEntity()));
        // Contraseña excluida obligatoriamente
        return response;
    }

    public void updateEntity(UsuarioRequestDTO request, UsuarioEntity entity) {
        if (request == null || entity == null) return;

        if (request.getPrimerNombre() != null) entity.setPrimerNombre(request.getPrimerNombre());
        if (request.getSegundoNombre() != null) entity.setSegundoNombre(request.getSegundoNombre());
        if (request.getPrimerApellido() != null) entity.setPrimerApellido(request.getPrimerApellido());
        if (request.getSegundoApellido() != null) entity.setSegundoApellido(request.getSegundoApellido());
        if (request.getCorreo() != null) entity.setCorreo(request.getCorreo());
        if (request.getTelefono() != null) entity.setTelefono(request.getTelefono());
        if (request.getEstado() != null) entity.setEstado(request.getEstado());

        // El Rol se maneja con cuidado para no instanciar si no viene en el Request
        if (request.getIdRol() != null) {
            if (entity.getRolEntity() == null) {
                entity.setRolEntity(new com.josbar.medisistemas.api.domain.entities.RolEntity());
            }
            entity.getRolEntity().setId(request.getIdRol());
        }
    }
}