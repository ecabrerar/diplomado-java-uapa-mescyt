/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eudriscabrera.java.dukes.eshop.utilidades;

/**
 *
 * @author ecabrerar
 */
public class PrecioDB {
    
    public static double getPrecioCelular(Marca marca){
        double precio = 0.0;
        
        if(Marca.MOTOROLA.equals(marca)){
            precio =3500;
        } else if(Marca.ALCATEL.equals(marca)){
            
        }        
        
        return precio;
        
    }
}
