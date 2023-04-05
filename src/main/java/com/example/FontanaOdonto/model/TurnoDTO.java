package com.example.FontanaOdonto.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TurnoDTO {
    private Long id;
    private LocalDate fecha;
    private Paciente paciente;
    private Odontologo odontologo;
}
