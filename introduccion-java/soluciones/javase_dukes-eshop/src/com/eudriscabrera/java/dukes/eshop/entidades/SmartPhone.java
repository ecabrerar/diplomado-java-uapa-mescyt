/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.dukes.eshop.entidades;

import com.eudriscabrera.java.dukes.eshop.interfaces.Conectividad2G;
import com.eudriscabrera.java.dukes.eshop.interfaces.Conectividad3G;
import com.eudriscabrera.java.dukes.eshop.interfaces.ConectividadWiFi;

import java.util.Date;

/**
 *
 * @author ecabrerar
 */
public class SmartPhone extends DispositivoMovil implements Conectividad2G, Conectividad3G, ConectividadWiFi {

    private String tipoTeclado;
    private boolean wifi;
    private boolean conectividad2G;
    private boolean conectividad3G;
    private boolean GPS;
    private boolean multiTactil;

    public SmartPhone(String tipoTeclado, boolean wifi, boolean conectividad2G, boolean conectividad3G, boolean GPS, String nombre, String marca, String version, String capAlmInterno, String dimensionPantalla, Date fechaLanzamiento, boolean multiTactil) {
        super(nombre, marca, version, capAlmInterno, dimensionPantalla, fechaLanzamiento);
        this.tipoTeclado = tipoTeclado;
        this.wifi = wifi;
        this.conectividad2G = conectividad2G;
        this.conectividad3G = conectividad3G;
        this.GPS = GPS;
        this.multiTactil = multiTactil;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    @Override
    public boolean isConectividad2G() {
        return conectividad2G;
    }

    @Override
    public void setConectividad2G(boolean conectividad2G) {
        this.conectividad2G = conectividad2G;
    }

    @Override
    public boolean isConectividad3G() {
        return conectividad3G;
    }

    @Override
    public void setConectividad3G(boolean conectividad3G) {
        this.conectividad3G = conectividad3G;
    }

    public boolean isGPS() {
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    @Override
    public void setConectividadWiFi(boolean wifi) {
        this.wifi = wifi;
    }

    @Override
    public boolean isConectividadWifi() {
        return wifi;
    }

    public boolean isMultiTactil() {
        return multiTactil;
    }

    public void setMultiTactil(boolean multiTactil) {
        this.multiTactil = multiTactil;
    }

    @Override
    public double calcularPrecio() {
        double precioInicial = 8000;
        double precioFinal = 0.0;

        if (isConectividad3G() && isConectividadWifi()) {
            double porciento = 0.15;

            precioFinal = precioInicial + precioInicial * 0.15;

        }

        if (isMultiTactil()) {
            precioFinal = precioFinal > precioInicial ? (precioFinal + (precioFinal * 0.05)) : (precioInicial + (precioInicial * 0.05));
        }

        return precioFinal;
    }

    @Override
    public void imprimirInformacion() {

        StringBuilder spStr = new StringBuilder(100).append(toString())
                .append("tipoTeclado:").append(tipoTeclado).append(",").append("\n")
                .append("wifi:").append(wifi).append(",").append("\n")
                .append("multiTactil:").append(multiTactil).append(",").append("\n")
                .append("GPS:").append(GPS).append(",").append("\n")
                .append("conectividad2G:").append(conectividad2G).append(",").append("\n")
                .append("conectividad3G:").append(conectividad3G).append(",").append("\n")
                .append("precio:").append(calcularPrecio()).append("\n");

        System.out.println("SmartPhone {".concat(spStr.toString()).concat("}\n"));
    }

}
