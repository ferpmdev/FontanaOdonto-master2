package com.example.FontanaOdonto.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class OdontologoDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private String matricula;
    private Set<Turno> turnos;
}
