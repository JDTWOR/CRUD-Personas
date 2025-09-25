package com.example.primerawebspringboot.entities;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_personas")
@Data // Se encarga de crear los getters y setter para cada uno de los atributos de la entidad o modelo
@AllArgsConstructor // Se encarga de crear un constrcutor que contenga todos los campos o atributos(hace referencia a ALL de todos)
@NoArgsConstructor // Se encarga de crear un constructor sin ningun campo
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int edad;


}


