package com.eudriscabrera.java.poo.basico.estatico;

/**
 * 
 * @author ecabrerar
 */
public class MetodoEstatico {
    
    public static double realizarDescuento(double precio){
        return precio - (precio * 0.1); 
    }
    
    public double inicializar(double descuento){
        return realizarDescuento(descuento);
    }
    
    public static void main(String[] args){
      double precio = 120.98;
      double precioFinal = MetodoEstatico.realizarDescuento(precio);
      
      System.out.println(" Precio Final: "+precioFinal);
    }    
    
}
