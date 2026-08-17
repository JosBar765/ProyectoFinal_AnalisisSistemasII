package com.josbar.medisistemas.api.controllers.expediente_clinico;

import com.josbar.medisistemas.api.domain.dtos.documento.SubirDocumentoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.documento.ActualizarDocumentoRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.documento.DocumentoResponseDTO;
import com.josbar.medisistemas.api.domain.entities.DocumentoEntity;
import com.josbar.medisistemas.api.mappers.impl.DocumentoMapper;
import com.josbar.medisistemas.api.services.DocumentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DocumentoController {

    private final DocumentoService documentoService;
    private final DocumentoMapper documentoMapper;

    public DocumentoController(DocumentoService documentoService, DocumentoMapper documentoMapper) {
        this.documentoService = documentoService;
        this.documentoMapper = documentoMapper;
    }

    @PostMapping(path = "/documentos")
    public ResponseEntity<DocumentoResponseDTO> subirDocumento(@RequestBody SubirDocumentoRequestDTO request) {
        // En tu service se debe setear el ID del usuarioCarga desde el JWT
        DocumentoEntity saved = documentoService.subir(documentoMapper.toEntity(request));
        return new ResponseEntity<>(documentoMapper.toResponse(saved), HttpStatus.CREATED);
    }

    @PutMapping(path = "/documentos/{id}")
    public ResponseEntity<DocumentoResponseDTO> actualizarDocumento(
            @PathVariable("id") Integer id,
            @RequestBody ActualizarDocumentoRequestDTO request) {

        // El service se encarga de crear la AuditoriaDocumentoEntity y setear la URL nueva
        DocumentoEntity updated = documentoService.actualizar(id, request);
        return new ResponseEntity<>(documentoMapper.toResponse(updated), HttpStatus.OK);
    }
}