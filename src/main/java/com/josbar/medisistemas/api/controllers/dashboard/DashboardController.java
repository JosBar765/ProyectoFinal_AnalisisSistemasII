package com.josbar.medisistemas.api.controllers.dashboard;

import com.josbar.medisistemas.api.domain.dtos.dashboard.DashboardResponseDTO;
import com.josbar.medisistemas.api.services.DashboardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping
    public ResponseEntity<DashboardResponseDTO> obtenerDashboard() {
        DashboardResponseDTO dashboard = dashboardService.obtenerMetricas();
        return new ResponseEntity<>(dashboard, HttpStatus.OK);
    }
}