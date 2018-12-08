package com.eudriscabrera.java.poo.empresa.nomina.entidades;

import com.eudriscabrera.java.poo.empresa.nomina.abstracion.Sueldo;

/**
 *
 * @author ecabrerar
 */
public class Consultor extends Persona implements Sueldo{
    private double precioHora;
    private double cantidadHora;
    
    
    @Override
    public double getSueldo() {
       return calcularSueldoConsultor();
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double getCantidadHora() {
        return cantidadHora;
    }

    public void setCantidadHora(double cantidadHora) {
        this.cantidadHora = cantidadHora;
    }
    
    
    private double calcularSueldoConsultor(){
        return (cantidadHora * precioHora)-((cantidadHora * precioHora) * 0.1);
    }
    
    
}