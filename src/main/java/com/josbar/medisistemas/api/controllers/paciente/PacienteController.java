package com.josbar.medisistemas.api.controllers.admin;

import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.paciente.PacienteResponseDTO;
import com.josbar.medisistemas.api.domain.entities.PacienteEntity;
import com.josbar.medisistemas.api.mappers.impl.PacienteMapper;
import com.josbar.medisistemas.api.services.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PacienteController {

    private final PacienteService pacienteService;
    private final PacienteMapper pacienteMapper;

    public PacienteController(PacienteService pacienteService, PacienteMapper pacienteMapper) {
        this.pacienteService = pacienteService;
        this.pacienteMapper = pacienteMapper;
    }

    @PostMapping(path = "/pacientes")
    public ResponseEntity<PacienteResponseDTO> registrarPaciente(@RequestBody PacienteRequestDTO request) {
        PacienteEntity saved = pacienteService.save(pacienteMapper.toEntity(request));
        return new ResponseEntity<>(pacienteMapper.toResponse(saved), HttpStatus.CREATED);
    }

    @GetMapping(path = "/pacientes")
    public List<PacienteResponseDTO> consultarPacientes() {
        return pacienteService.findAll().stream()
                .map(pacienteMapper::toResponse)
                .collect(Collectors.toList());
    }

    @PutMapping(path = "/pacientes/{id}")
    public ResponseEntity<PacienteResponseDTO> modificarPaciente(
            @PathVariable("id") Integer id,
            @RequestBody PacienteRequestDTO request) {

        PacienteEntity existing = pacienteService.findById(id);
        if (existing == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        pacienteMapper.updateEntity(request, existing);
        PacienteEntity updated = pacienteService.save(existing);
        return new ResponseEntity<>(pacienteMapper.toResponse(updated), HttpStatus.OK);
    }
}