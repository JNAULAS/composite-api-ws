/**
 * 
 */
package com.patrones.disenno.estructural.composite.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.patrones.disenno.estructural.composite.model.Carpeta;
import com.patrones.disenno.estructural.composite.model.ComponentArchivo;
import com.patrones.disenno.estructural.composite.model.Pdf;
import com.patrones.disenno.estructural.composite.request.CarpetaCompositeRequest;

/**
 * @author juannaula
 *
 */
@Controller
public class CompositeController {
	/*
	 * Variables globales
	 */
	private ComponentArchivo componentArchivo;
	private Carpeta carpeta;
	private List<Carpeta> listCarpetas = new ArrayList<Carpeta>();
	private List<ComponentArchivo> listaArchivos = new ArrayList<ComponentArchivo>();
	
	
	// Metodos Getters and setters

	public Carpeta getCarpeta() {
		return carpeta;
	}
	public ComponentArchivo getComponentArchivo() {
		return componentArchivo;
	}
	public void setComponentArchivo(ComponentArchivo componentArchivo) {
		this.componentArchivo = componentArchivo;
	}
	public List<Carpeta> getListCarpetas() {
		return listCarpetas;
	}
	public void setListCarpetas(List<Carpeta> listCarpetas) {
		this.listCarpetas = listCarpetas;
	}
	public List<ComponentArchivo> getListaArchivos() {
		return listaArchivos;
	}
	public void setListaArchivos(List<ComponentArchivo> listaArchivos) {
		this.listaArchivos = listaArchivos;
	}
	public void setCarpeta(Carpeta carpeta) {
		this.carpeta = carpeta;
	}
	
	// Servicios
    @GetMapping("/home")
    public String home(Model model) {
    	String mensaje = "Bienvenidos";
    	model.addAttribute("mensaje", mensaje);
        return "home";
    }
    @GetMapping("/createFolder")
    public String createFolder(@ModelAttribute CarpetaCompositeRequest carpetaCompositeRequest) {
    	Carpeta carpetaSave = new Carpeta(); 
    	carpetaSave = carpeta.agregarCarpeta(carpetaCompositeRequest.getNombre());
    	listCarpetas.add(carpetaSave);

        return "createFolder";
    }
    @GetMapping("/compositeArchivoList")
    public String obtieneListaArchivos(Model model) {
    	Carpeta carpeta = new Carpeta();
    	carpeta.agregarCarpeta("Pruebas");
    	componentArchivo = new Pdf("Composition.pdf");
    	carpeta.agregarArchivo(componentArchivo);
    	
    	componentArchivo = new Pdf("Composition.pdf");
    	carpeta.agregarArchivo(componentArchivo);
    	
    	listaArchivos = carpeta.getListComponenteArchivo();
    	
    	
        model.addAttribute("listaArchivos", listaArchivos); // Add the list of vehicles to the model
        return "compositeArchivoList"; // Return the name of your Thymeleaf template
    }

}
