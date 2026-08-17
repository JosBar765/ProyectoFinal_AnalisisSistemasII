package com.josbar.medisistemas.api.controllers;

import com.josbar.medisistemas.api.domain.dtos.medico.MedicoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.medico.MedicoResponseDTO;
import com.josbar.medisistemas.api.domain.dtos.jornada_medica.JornadaMedicaRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.jornada_medica.JornadaMedicaResponseDTO;
import com.josbar.medisistemas.api.mappers.impl.MedicoMapper;
import com.josbar.medisistemas.api.mappers.impl.JornadaMedicaMapper;
import com.josbar.medisistemas.api.services.MedicoService;
import com.josbar.medisistemas.api.services.JornadaMedicaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MedicoController {

    private final MedicoService medicoService;
    private final MedicoMapper medicoMapper;
    private final JornadaMedicaService jornadaService;
    private final JornadaMedicaMapper jornadaMapper;

    public MedicoController(MedicoService medicoService, MedicoMapper medicoMapper, JornadaMedicaService jornadaService, JornadaMedicaMapper jornadaMapper) {
        this.medicoService = medicoService;
        this.medicoMapper = medicoMapper;
        this.jornadaService = jornadaService;
        this.jornadaMapper = jornadaMapper;
    }

    @PostMapping(path = "/medicos")
    public ResponseEntity<MedicoResponseDTO> registrarMedico(@RequestBody MedicoRequestDTO request) {
        var entity = medicoService.save(medicoMapper.toEntity(request));
        return new ResponseEntity<>(medicoMapper.toResponse(entity), HttpStatus.CREATED);
    }

    @PostMapping(path = "/jornadas")
    public ResponseEntity<JornadaMedicaResponseDTO> gestionarJornada(@RequestBody JornadaMedicaRequestDTO request) {
        var entity = jornadaService.save(jornadaMapper.toEntity(request));
        return new ResponseEntity<>(jornadaMapper.toResponse(entity), HttpStatus.CREATED);
    }
}