package com.example.FontanaOdonto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="turnos")
@Getter
@Setter
public class Turno {
  @Id
  @GeneratedValue
  private Long id;
  private LocalDate fecha;
  @ManyToOne
  @JoinColumn(name="paciente_id", nullable = false )
  private Paciente paciente;
  @ManyToOne
  @JoinColumn(name="odontologo_id", nullable = false )
  private Odontologo odontologo;
  
  public Turno(LocalDate fecha, Paciente paciente, Odontologo odontologo) {
    this.fecha = fecha;
    this.paciente = paciente;
    this.odontologo = odontologo;
  }
  
  public Turno(Long id, LocalDate fecha, Paciente paciente, Odontologo odontologo) {
    this.id = id;
    this.fecha = fecha;
    this.paciente = paciente;
    this.odontologo = odontologo;
  }
  
  public Turno() {
  }
  
  @Override
  public String toString() {
    return "Turno{" +
        "id=" + id +
        ", fecha=" + fecha +
        ", paciente=" + paciente +
        ", odontologo=" + odontologo +
        '}';
  }
}
