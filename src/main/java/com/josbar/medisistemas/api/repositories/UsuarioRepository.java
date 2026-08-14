package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Integer> {
}
