/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.dukes.eshop.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ecabrerar
 */
public abstract class DispositivoMovil {

    private String nombre;
    private String marca;
    private String version;
    private String capAlmInterno;
    private String dimensionPantalla;
    private Date fechaLanzamiento;

    public DispositivoMovil(String nombre, String marca, String version, String capAlmInterno, String dimensionPantalla, Date fechaLanzamiento) {
        this.nombre = nombre;
        this.marca = marca;
        this.version = version;
        this.capAlmInterno = capAlmInterno;
        this.dimensionPantalla = dimensionPantalla;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the capAlmInterno
     */
    public String getCapAlmInterno() {
        return capAlmInterno;
    }

    /**
     * @param capAlmInterno the capAlmInterno to set
     */
    public void setCapAlmInterno(String capAlmInterno) {
        this.capAlmInterno = capAlmInterno;
    }

    /**
     * @return the dimensionPantalla
     */
    public String getDimensionPantalla() {
        return dimensionPantalla;
    }

    /**
     * @param dimensionPantalla the dimensionPantalla to set
     */
    public void setDimensionPantalla(String dimensionPantalla) {
        this.dimensionPantalla = dimensionPantalla;
    }

    /**
     * @return the fechaLanzamiento
     */
    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * @param fechaLanzamiento the fechaLanzamiento to set
     */
    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder(75);
       
        result.append("\n").append("nombre:").append(nombre).append(",").append("\n");
        result.append("marca:").append(marca).append(",").append("\n");
        result.append("version:").append(version).append(",").append("\n");
        result.append("capAlmInterno:").append(capAlmInterno).append(",").append("\n");
        result.append("dimensionPantalla:").append(dimensionPantalla).append(",").append("\n");
        result.append("fechaLanzamiento:").append(new SimpleDateFormat("dd/mm/yyyy").format(fechaLanzamiento)).append(",").append("\n");
      
        return result.toString();

    }

   public abstract double calcularPrecio();
    
    public void imprimirInformacion(){
        System.out.println(toString());
    }
}
