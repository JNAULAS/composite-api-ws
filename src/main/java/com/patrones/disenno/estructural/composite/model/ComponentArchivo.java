/**
 * 
 */
package com.patrones.disenno.estructural.composite.model;

/**
 * 
 */
public abstract class ComponentArchivo {
	
	private String nombreArchivo;
	private int tamanoArchivo;
	
	
	
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public int getTamanoArchivo() {
		return tamanoArchivo;
	}
	public void setTamanoArchivo(int tamanoArchivo) {
		this.tamanoArchivo = tamanoArchivo;
	}
	
	/*Definicion metodos comunes para todas las subclases*/
	//public abstract void agregarArchivo();
	public abstract int obtenerTamanoArchivo();
	public abstract String obtenerNombreArchivo();
	//public abstract void eliminarArchivo();
	

}
