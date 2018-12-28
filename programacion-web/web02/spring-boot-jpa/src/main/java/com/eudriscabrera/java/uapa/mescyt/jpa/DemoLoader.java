/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.uapa.mescyt.jpa;

import com.eudriscabrera.java.uapa.mescyt.jpa.entidades.Pais;
import com.eudriscabrera.java.uapa.mescyt.jpa.entidades.Persona;
import com.eudriscabrera.java.uapa.mescyt.jpa.repositorios.RepositorioPais;
import com.eudriscabrera.java.uapa.mescyt.jpa.repositorios.RepositorioPersona;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 *
 * @author ecabrerar
 */
@Component
public class DemoLoader implements ApplicationListener<ContextRefreshedEvent> {

    private RepositorioPais repositorioPais;
    private RepositorioPersona repositorioPersona;

    static final Logger logger = Logger.getLogger(DemoLoader.class.getName());

    public RepositorioPais getRepositorioPais() {
        return repositorioPais;
    }

    @Autowired
    public void setRepositorioPais(RepositorioPais repositorioPais) {
        this.repositorioPais = repositorioPais;
    }

    public RepositorioPersona getRepositorioPersona() {
        return repositorioPersona;
    }

    @Autowired
    public void setRepositorioPersona(RepositorioPersona repositorioPersona) {
        this.repositorioPersona = repositorioPersona;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {

        Pais rd = new Pais();
        rd.setDescripcion("Republica Dominicana");

        repositorioPais.save(rd);

        logger.info("Pais 1 Agregado ".concat(String.valueOf(rd.getId())));

        Pais pr = new Pais();
        pr.setDescripcion("Puerto Rico");

        repositorioPais.save(pr);

        logger.info("Pais 2 Agregado ".concat(String.valueOf(pr.getId())));

        Pais ven = new Pais();
        ven.setDescripcion("Venezuela");

        repositorioPais.save(ven);

        logger.info("Pais 3 Agregado ".concat(String.valueOf(ven.getId())));

        Persona hc = new Persona();
        hc.setNombre("Nicolas");
        hc.setApellido("Maduro");
        hc.setPais(ven);

        repositorioPersona.save(hc);

        logger.info("Persona 1 Agregada ".concat(String.valueOf(hc.getId())));

        Persona rc = new Persona();
        rc.setNombre("Roberto");
        rc.setApellido("Clemente");
        rc.setPais(pr);

        repositorioPersona.save(rc);

        logger.info("Persona 2 Agregada ".concat(String.valueOf(rc.getId())));

        Persona gl = new Persona();
        gl.setNombre("Gregorio");
        gl.setApellido("Luperon");
        gl.setPais(rd);

        repositorioPersona.save(gl);

        logger.info("Persona 3 Agregada ".concat(String.valueOf(gl.getId())));

    }

}
