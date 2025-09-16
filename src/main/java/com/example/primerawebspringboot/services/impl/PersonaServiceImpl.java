package com.example.primerawebspringboot.services.impl;

import com.example.primerawebspringboot.entities.Persona;
import com.example.primerawebspringboot.repository.PersonaRepository;
import com.example.primerawebspringboot.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona ObtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        Persona personaDB = personaRepository.findById(id).orElse(null);
        if (personaDB != null){
            personaDB.setNombre(persona.getNombre());
            personaDB.setEdad(persona.getEdad());
            return personaRepository.save(personaDB);
        }
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }
}
