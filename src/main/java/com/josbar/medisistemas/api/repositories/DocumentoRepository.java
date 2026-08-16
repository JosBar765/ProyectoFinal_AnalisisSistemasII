package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.DocumentoEntity;
import org.springframework.data.repository.CrudRepository;

public interface DocumentoRepository extends CrudRepository<DocumentoEntity, Integer> {
}
