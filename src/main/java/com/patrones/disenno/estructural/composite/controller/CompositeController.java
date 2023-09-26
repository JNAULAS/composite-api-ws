/**
 * 
 */
package com.patrones.disenno.estructural.composite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author juannaula
 *
 */
@Controller
public class CompositeController {
	
	
    @GetMapping("/home")
    public String home(Model model) {
    	String mensaje = "Bienvenidos";
    	model.addAttribute("mensaje", mensaje);
        return "home";
    }

}
