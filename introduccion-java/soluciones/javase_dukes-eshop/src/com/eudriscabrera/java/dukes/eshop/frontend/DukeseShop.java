/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.dukes.eshop.frontend;

import com.eudriscabrera.java.dukes.eshop.entidades.Celular;
import com.eudriscabrera.java.dukes.eshop.entidades.SmartPhone;
import com.eudriscabrera.java.dukes.eshop.entidades.Tableta;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author ecabrerar
 */
public class DukeseShop {

    public static void main(String[] args) throws ParseException {

        //Ejemplo:
//        Tableta tableta = new Tableta();
//        tableta.setWiFi(true);
//        
//        String mensaje = tableta.isConectividadWifi()?"SI":"NO";
//        System.out.println(" soporta wifi "+ mensaje);
        Celular alcatel1 = new Celular("one touch", "Alcatel", "2016", "1 MB", "4.29 pulgs × 1.77 pulgs × 0.87 pulgs ", new SimpleDateFormat("dd/mm/yyyy").parse("25/11/2016"));
        Celular alcatel2 = new Celular("J105i", "Sony Ericsson", "2014", "1 MB", "4.29 pulgs × 1.77 pulgs × 0.87 pulgs ", new SimpleDateFormat("dd/mm/yyyy").parse("25/06/2016"));

        Celular[] celulares = new Celular[2];
        celulares[0] = alcatel1;
        celulares[1] = alcatel2;

        System.out.println("--------------Celulares-------------------");

        for (Celular celular : celulares) {

            celular.imprimirInformacion();
        }

        System.out.println("--------------SmartPhones-------------------");

        SmartPhone smartp = new SmartPhone("Virtual", true, true, true, true, "Moto X4", "Motorola", "XT1900-4", "32 MB", "5.2", new SimpleDateFormat("dd/mm/yyyy").parse("30/10/2016"), true);

        SmartPhone smartp1 = new SmartPhone("Virtual", true, true, true, true, "Moto X6", "Motorola", "XT1900-6", "32 MB", "5.2", new SimpleDateFormat("dd/mm/yyyy").parse("30/10/2016"), true);

        SmartPhone[] sps = new SmartPhone[2];

        sps[0] = smartp;
        sps[1] = smartp1;

        for (SmartPhone sp : sps) {
            sp.imprimirInformacion();
        }

        System.out.println("--------------Tabletas-------------------");

        Tableta tableta = new Tableta("Galaxy Tab S3", "Samsung", "SM-T825N", "32 MB", "237.3 x 169 x 6 mm", new SimpleDateFormat("dd/mm/yyyy").parse("04/04/2017"));
        tableta.setSistemaOperativo("Android Oreo");

        Tableta tableta1 = new Tableta("Nexus 10", "Google Nexus", "SM-T825N", "32 MB", "10.55 pulgs", new SimpleDateFormat("dd/mm/yyyy").parse("04/04/2017"));
        tableta1.setSistemaOperativo("Android 9P");

        Tableta[] tabletas = new Tableta[2];
        tabletas[0] = tableta;
        tabletas[1] = tableta1;

        for (Tableta tableta2 : tabletas) {
            tableta2.imprimirInformacion();
        }
    }

}
