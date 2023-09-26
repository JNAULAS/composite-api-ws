/**
 * 
 */
package com.patrones.disenno.estructural.composite.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Carpeta extends ComponentArchivo {
	
	List<ComponentArchivo> listComponenteArchivo;
	
	public Carpeta (String nombre) {
		if(this.listComponenteArchivo==null)
			this.listComponenteArchivo= new ArrayList<ComponentArchivo>();
		this.setNombreArchivo(nombre);
		this.setTamanoArchivo(obtenerTamanoArchivo());
	}

	@Override
	public int obtenerTamanoArchivo() {
		int tamannoTotal = 40;
		for (ComponentArchivo componentArchivo : listComponenteArchivo) {
			tamannoTotal += componentArchivo.getTamanoArchivo();
		}
		return tamannoTotal;
	}

	@Override
	public String obtenerNombreArchivo() {
		return this.getNombreArchivo();
	}
	
	public void agregarArchivo(ComponentArchivo componentArchivo) {
		this.listComponenteArchivo.add(componentArchivo);
	}

	public void eliminarArchivo(ComponentArchivo componentArchivo) {
		this.listComponenteArchivo.remove(componentArchivo);
	}
}
