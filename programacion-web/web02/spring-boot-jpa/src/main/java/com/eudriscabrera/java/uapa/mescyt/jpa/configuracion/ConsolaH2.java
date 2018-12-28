/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.uapa.mescyt.jpa.configuracion;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ecabrerar
 */
@Configuration
public class ConsolaH2 {
    
    @Bean
    ServletRegistrationBean init(){
        ServletRegistrationBean consolah2 = new ServletRegistrationBean(new WebServlet());
        consolah2.addUrlMappings("/console/*");
        
        return consolah2;
        
    }
}
