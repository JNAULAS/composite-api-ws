/**
 * 
 */
package com.patrones.disenno.estructural.composite.compositeapiws.model;

/**
 * 
 */
public class Xlsx extends ComponentArchivo{
	
	public Xlsx (String nombre) {
		this.setNombreArchivo(nombre);
		this.setTamanoArchivo(obtenerTamanoArchivo());
	}

	@Override
	public int obtenerTamanoArchivo() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public String obtenerNombreArchivo() {
		// TODO Auto-generated method stub
		return  this.getNombreArchivo(); // "File_Pruebas.xlsx";
	}
	

}
