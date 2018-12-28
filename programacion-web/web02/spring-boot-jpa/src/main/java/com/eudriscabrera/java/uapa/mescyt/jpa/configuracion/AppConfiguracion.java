/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.uapa.mescyt.jpa.configuracion;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author ecabrerar
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.eudriscabrera.java.uapa.mescyt.jpa.entidades"})
@EnableJpaRepositories(basePackages = {"com.eudriscabrera.java.uapa.mescyt.jpa.repositorios"})
@EnableTransactionManagement
public class AppConfiguracion {
    
}
