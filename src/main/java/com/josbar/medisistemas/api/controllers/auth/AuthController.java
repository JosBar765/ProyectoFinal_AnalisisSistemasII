package com.josbar.medisistemas.api.controllers.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.josbar.medisistemas.api.domain.dtos.auth.LoginRequestDTO;
import com.josbar.medisistemas.api.domain.dtos.auth.AuthResponseDTO;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> autenticarUsuario(@RequestBody LoginRequestDTO loginRequest) {
        AuthResponseDTO tokenResponse = authService.autenticar(loginRequest);
        return new ResponseEntity<>(tokenResponse, HttpStatus.OK);
    }
}