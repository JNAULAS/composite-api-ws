/**
 * 
 */
package com.patrones.disenno.estructural.composite.model;

/**
 * 
 */
public class Docx extends ComponentArchivo {
	
	public Docx (String nombre) {
		this.setNombreArchivo(nombre);
		this.setTamanoArchivo(obtenerTamanoArchivo());
	}

	@Override
	public int obtenerTamanoArchivo() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public String obtenerNombreArchivo() {
		// TODO Auto-generated method stub
		return  this.getNombreArchivo();
	}
	
}
