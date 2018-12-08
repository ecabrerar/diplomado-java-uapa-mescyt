package com.eudriscabrera.java.poo.empresa.nomina.util;

import com.eudriscabrera.java.poo.empresa.nomina.entidades.Posicion;

/**
 * Representa nuestra fuente de datos para saber el sueldo que corresponde 
 * a cada posicion dentro de la empresa
 *
 * @author ecabrerar
 */
public class SueldoDB {

    public static double getSueldo(Posicion posicion) {

        switch (posicion) {
            case SECRETARIA:
                return 15000;
            case CONTABLE:
                return 25000;
            case MECANICO:
                return 18000;
            case COORDINADOR:
                return 35000;
            case GERENTE:
                return 55000;
            default:
                return 0.0;
        }
    }
}