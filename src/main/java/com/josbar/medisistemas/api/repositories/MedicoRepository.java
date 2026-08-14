package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.MedicoEntity;
import org.springframework.data.repository.CrudRepository;

public interface MedicoRepository extends CrudRepository<MedicoEntity, Integer> {
}
