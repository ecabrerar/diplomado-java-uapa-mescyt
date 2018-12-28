/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.uapa.mescyt.jpa.repositorios;

import com.eudriscabrera.java.uapa.mescyt.jpa.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ecabrerar
 */
public interface RepositorioPersona extends JpaRepository<Persona, Long>{
    
}
