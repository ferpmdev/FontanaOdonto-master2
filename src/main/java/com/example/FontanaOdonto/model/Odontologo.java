package com.example.FontanaOdonto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="odontologos")
@Getter
@Setter
public class Odontologo {
    @Id
    @GeneratedValue
    private Integer id;
    private String nombre;
    private String apellido;
    private String matricula;

    @OneToMany(mappedBy = "odontologo")
    @JsonIgnore
    private Set<Turno> turnos;


    public Odontologo(Integer id, String nombre, String apellido, String matricula, Set<Turno> turnos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.turnos = turnos;
    }

    public Odontologo(String nombre, String apellido, String matricula, Set<Turno> turnos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.turnos = turnos;
    }

    public Odontologo() {
    }

    @Override
    public String toString() {
        return "Odontologo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
