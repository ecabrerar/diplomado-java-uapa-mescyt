/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.dukes.eshop.entidades;

import java.util.Date;



/**
 *
 * @author ecabrerar
 */
public class Celular extends DispositivoMovil {

    public Celular(String nombre, String marca, String version, String capAlmInterno, String dimensionPantalla, Date fechaLanzamiento) {
        super(nombre, marca, version, capAlmInterno, dimensionPantalla, fechaLanzamiento);
    }

    @Override
    public void imprimirInformacion() {
          StringBuilder celularStr = new StringBuilder(100).append(toString())               
                .append("precio:").append(calcularPrecio()).append("\n");
        
        System.out.println("Celular {".concat(celularStr.toString()).concat("}\n"));
    }

    @Override
    public double calcularPrecio() {
        double precio = 0.0;

        if ("Motorola".equalsIgnoreCase(getMarca())) {
            precio = 3500;
        } else if ("Samsung".equals(getMarca())) {
            precio = 4000;
        } else if ("Sony Ericsson".equals(getMarca())) {
            precio = 3500;
        } else if ("Alcatel".equals(getMarca())) {
            precio = 1500;
        }

        return precio;
    }

    
}
