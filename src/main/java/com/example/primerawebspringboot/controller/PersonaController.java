package com.example.primerawebspringboot.controller;

import com.example.primerawebspringboot.entities.Persona;
import com.example.primerawebspringboot.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    // La clase Model se usa para transferir objetos del controller a la
    @GetMapping("/")
    public String listarPersonas(Model model){
        List<Persona> personas = personaService.listarPersonas();
        model.addAttribute("personasLista", personas); // clave: valor
        return "listar";
    }

}
