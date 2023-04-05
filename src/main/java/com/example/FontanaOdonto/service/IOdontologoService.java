package com.example.FontanaOdonto.service;

import com.example.FontanaOdonto.model.OdontologoDTO;

import java.util.Set;

public interface IOdontologoService {
    void crearOdontologo(OdontologoDTO odontologoDTO);
    OdontologoDTO leerOdontologo(Integer id);
    void modificarOdontologo(OdontologoDTO odontologoDTO);
    void eliminarOdontologo(Integer id);
    Set<OdontologoDTO> getTodos();
}
