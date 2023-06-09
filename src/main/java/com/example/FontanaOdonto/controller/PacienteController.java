package com.example.FontanaOdonto.controller;

import com.example.FontanaOdonto.model.PacienteDTO;
import com.example.FontanaOdonto.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    IPacienteService pacienteService;

    @PostMapping
    public ResponseEntity<?> crearPaciente(@RequestBody PacienteDTO pacienteDTO) {
        pacienteService.crearPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PacienteDTO leerPaciente(@PathVariable Integer id) {
        return pacienteService.leerPaciente(id);
    }


    @PutMapping
    public ResponseEntity<?> modificarPaciente(@RequestBody PacienteDTO pacienteDTO) {
        pacienteService.modificarPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Integer id) {
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<PacienteDTO> getTodosPacientes() {
        return pacienteService.getTodos();
    }
}