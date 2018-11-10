package com.eudriscabrera.java.poo.basico.herencia;

import com.eudriscabrera.java.poo.basico.sobreescritura.Product;


/**
 * 
 * @author ecabrerar
 */
public class Book extends Product {
    private String Author;
    
    public Book(String string, String string1, double d) {
        super(string, string1, d);
    }
    
    public Book(){
        
    }


    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }
}
