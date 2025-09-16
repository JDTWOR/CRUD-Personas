package com.example.primerawebspringboot.services;

import com.example.primerawebspringboot.entities.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> listarPersonas();
    Persona ObtenerPorId(Long id);
    Persona crearPersona(Persona persona);
    Persona actualizarPersona(Long id, Persona persona);
    void eliminarPersona(Long id);
}
