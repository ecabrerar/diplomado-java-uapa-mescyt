/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.java.uapa.mescyt.springbootbasico;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ecabrerar
 */
@Controller
public class SaludoController {
    
    @RequestMapping(value="saludo",method = POST)
    public String saludos(@RequestParam(value = "nombre",required = false, defaultValue = "Eudris Cabrera") String nombre, Model model){
        model.addAttribute("nombre", nombre);
        
        return "saludos";
    }
    

}
