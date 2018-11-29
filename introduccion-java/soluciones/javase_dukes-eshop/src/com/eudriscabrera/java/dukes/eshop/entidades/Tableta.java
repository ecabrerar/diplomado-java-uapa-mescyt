/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.dukes.eshop.entidades;

import com.eudriscabrera.java.dukes.eshop.interfaces.Conectividad3G;
import com.eudriscabrera.java.dukes.eshop.interfaces.ConectividadWiFi;
import java.util.Date;

/**
 *
 * @author ecabrerar
 */
public class Tableta extends DispositivoMovil implements ConectividadWiFi, Conectividad3G {

    private String sistemaOperativo;
    private boolean wifi;

    private boolean conectividad3G;

    public Tableta(String nombre, String marca, String version, String capAlmInterno, String dimensionPantalla, Date fechaLanzamiento) {
        super(nombre, marca, version, capAlmInterno, dimensionPantalla, fechaLanzamiento);
    }

    @Override
    public void setConectividadWiFi(boolean wifi) {
        this.wifi = wifi;
    }

    @Override
    public boolean isConectividadWifi() {
        return wifi;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void setConectividad3G(boolean conectividad3G) {
        this.conectividad3G = conectividad3G;
    }

    @Override
    public boolean isConectividad3G() {
        return conectividad3G;
    }

    @Override
    public double calcularPrecio() {
        double precioInicial = 15000;
        double precioFinal = 0.0;

        if (isConectividad3G()) {
            precioFinal = precioInicial + precioInicial * 0.20;

        }

        return precioFinal > precioInicial ? precioFinal : precioInicial;
    }

    @Override
    public void imprimirInformacion() {

        StringBuilder spStr = new StringBuilder(100).append(toString())               
                .append("wifi:").append(wifi).append(",").append("\n")
                .append("sistemaOperativo:").append(sistemaOperativo).append(",").append("\n")     
                .append("conectividad3G:").append(conectividad3G).append(",").append("\n")
                .append("precio:").append(calcularPrecio()).append("\n");

        System.out.println("Tableta {".concat(spStr.toString()).concat("}\n"));
    }

}
