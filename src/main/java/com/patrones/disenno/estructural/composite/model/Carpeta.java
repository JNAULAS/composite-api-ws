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
	private String nombreCarpeta;
	List<ComponentArchivo> listComponenteArchivo = new ArrayList<ComponentArchivo>();
	List<Carpeta> listCarpetas = new  ArrayList<Carpeta>();

	public String getNombreCarpeta() {
		return nombreCarpeta;
	}

	public void setNombreCarpeta(String nombreCarpeta) {
		this.nombreCarpeta = nombreCarpeta;
	}

	public List<ComponentArchivo> getListComponenteArchivo() {
		return listComponenteArchivo;
	}

	public void setListComponenteArchivo(List<ComponentArchivo> listComponenteArchivo) {
		this.listComponenteArchivo = listComponenteArchivo;
	}

	@Override
	public int obtenerTamanoArchivo() {
		// TODO Auto-generated method stub
		int tamannoTotal = 0;
		for (ComponentArchivo componentArchivo : listComponenteArchivo) {
			tamannoTotal += componentArchivo.getTamanoArchivo();
		}
		return tamannoTotal;
	}

	@Override
	public String obtenerNombreArchivo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Carpeta agregarCarpeta(String nombreCarpeta) {
		Carpeta carpeta = new Carpeta();
		carpeta.setNombreCarpeta(nombreCarpeta);
		return carpeta;
		
	}

	public void agregarArchivo(ComponentArchivo componentArchivo) {
		this.listComponenteArchivo.add(componentArchivo);
	}

	public void eliminarArchivo(ComponentArchivo componentArchivo) {
		this.listComponenteArchivo.remove(componentArchivo);
	}
}
