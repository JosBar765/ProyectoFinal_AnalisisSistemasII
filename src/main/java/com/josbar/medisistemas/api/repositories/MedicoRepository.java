package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.MedicoEntity;
import org.springframework.data.repository.CrudRepository;

public interface MedicoRepository extends CrudRepository<MedicoEntity, Integer> {
}
