package com.example.FontanaOdonto;

import com.example.FontanaOdonto.model.PacienteDTO;
import com.example.FontanaOdonto.service.IPacienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
class PacienteServiceTest {

    @Autowired
    private IPacienteService pacienteService;
    @Test
    public void testCrearPaciente() {
        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setNombre("Gustavo");
        pacienteDTO.setApellido("Cerati");
        pacienteService.crearPaciente(pacienteDTO);
        PacienteDTO pacientePedro = pacienteService.leerPaciente(1);

        assertTrue(pacientePedro != null);
    }
}