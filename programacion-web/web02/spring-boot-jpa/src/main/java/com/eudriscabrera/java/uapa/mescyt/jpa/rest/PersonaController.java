/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.uapa.mescyt.jpa.rest;

import com.eudriscabrera.java.uapa.mescyt.jpa.entidades.Persona;
import com.eudriscabrera.java.uapa.mescyt.jpa.repositorios.RepositorioPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ecabrerar
 */
@RestController
@RequestMapping("/api")
public class PersonaController {
    
    @Autowired
    RepositorioPersona repositorioPersona;
    
    @GetMapping("/personas")
    public List<Persona> listarTodas(){
        
        return repositorioPersona.findAll();
    }
    
    @GetMapping("/personas/{id}")
    public Persona buscarPersona(@PathVariable("id") Long id){
        return repositorioPersona.findById(id).orElseThrow(()->new RuntimeException("No encontrado"));
    }
    
}
