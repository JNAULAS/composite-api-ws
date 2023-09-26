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
import org.springframework.web.bind.annotation.PostMapping;

import com.patrones.disenno.estructural.composite.dto.ArchivoDTO;
import com.patrones.disenno.estructural.composite.model.Carpeta;
import com.patrones.disenno.estructural.composite.model.ComponentArchivo;
import com.patrones.disenno.estructural.composite.model.Docx;
import com.patrones.disenno.estructural.composite.model.Pdf;
import com.patrones.disenno.estructural.composite.model.TipoDocumento;
import com.patrones.disenno.estructural.composite.model.Xlsx;
import com.patrones.disenno.estructural.composite.request.ArchivoCompositeRequest;

/**
 * @author juannaula
 *
 */
@Controller
public class CompositeController {
	private static Carpeta carpeta = new Carpeta("CarpetaContenedora");
	private static List<ArchivoDTO> listaArchivos = new ArrayList<ArchivoDTO>();
	
	
    @GetMapping("/createFileForm")
    public String createFileForm(Model model) {
        model.addAttribute("archivoCompositeRequest", new ArchivoCompositeRequest());
        model.addAttribute("tipoDocumento", TipoDocumento.values());
        return "createArchivo";
    }
    @PostMapping("/createFile")
    public String createFile(@ModelAttribute ArchivoCompositeRequest archivoCompositeRequest) {
		ComponentArchivo archivo = null;
		switch (archivoCompositeRequest.getTipoDocumento()) {
			case WORD:
				archivo = new Docx(archivoCompositeRequest.getNombreArchivo());
				break;
			case PDF:
				archivo = new Pdf(archivoCompositeRequest.getNombreArchivo());
				break;
			case EXCEL:
				archivo = new Xlsx(archivoCompositeRequest.getNombreArchivo());
				break;
			case CARPETA:
				archivo = new Carpeta(archivoCompositeRequest.getNombreArchivo());
				break;
			default:
				break;
		}
		carpeta.agregarArchivo(archivo);
		var archivoDTO = new ArchivoDTO();
		archivoDTO.setTipoDocumento(archivoCompositeRequest.getTipoDocumento());
		archivoDTO.setNombreArchivo(archivo.getNombreArchivo());
		archivoDTO.setNombreCarpeta(carpeta.getNombreArchivo());
		archivoDTO.setTamano(archivo.obtenerTamanoArchivo());
		archivoDTO.setTamanoCarpeta(carpeta.obtenerTamanoArchivo());
		listaArchivos.add(listaArchivos.size(), archivoDTO);
        return "redirect:/compositeArchivoList"; // Redirect to the form after creating the vehicle.
    }
    @GetMapping("/compositeArchivoList")
    public String obtieneListaArchivos(Model model) 
	{	
        model.addAttribute("listaArchivos", listaArchivos); // Add the list of vehicles to the model
        return "compositeArchivoList"; // Return the name of your Thymeleaf template
    }

}
