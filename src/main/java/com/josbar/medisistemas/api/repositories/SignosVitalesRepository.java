package com.josbar.medisistemas.api.repositories;

import com.josbar.medisistemas.api.domain.entities.SignosVitalesEntity;
import org.springframework.data.repository.CrudRepository;

public interface SignosVitalesRepository extends CrudRepository<SignosVitalesEntity, Integer> {
}
