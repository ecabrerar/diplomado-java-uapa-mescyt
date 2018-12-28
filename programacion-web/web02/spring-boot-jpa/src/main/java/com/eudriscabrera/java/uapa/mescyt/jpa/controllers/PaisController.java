/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.uapa.mescyt.jpa.controllers;

import com.eudriscabrera.java.uapa.mescyt.jpa.entidades.Pais;
import com.eudriscabrera.java.uapa.mescyt.jpa.repositorios.RepositorioPais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ecabrerar
 */
@Controller
public class PaisController {
    
    private RepositorioPais repositorioPais;

    public RepositorioPais getRepositorioPais() {
        return repositorioPais;
    }

    @Autowired
    public void setRepositorioPais(RepositorioPais repositorioPais) {
        this.repositorioPais = repositorioPais;
    }   
    
    
    @RequestMapping("/pais")
    public String index(Model model) {
        model.addAttribute("pais", repositorioPais.findAll());
        model.addAttribute("tituloEncabezado", "Probando Listado de Paises");
        return "listado-pais";
    }
    
    @RequestMapping(value = "/agregar",method =RequestMethod.POST)
    public String guardarPais(Pais pais){
        
        repositorioPais.save(pais);
        return "redirect:/pais";
    }
    
     @RequestMapping("/formulario")
    public String formPais(Model model){
        model.addAttribute("pais", new Pais());
        
        return "form-pais";
    }
    
}
