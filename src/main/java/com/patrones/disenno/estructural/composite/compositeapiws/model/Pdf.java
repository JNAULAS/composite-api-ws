/**
 * 
 */
package com.patrones.disenno.estructural.composite.compositeapiws.model;

/**
 * 
 */
public class Pdf extends ComponentArchivo {

	public Pdf (String nombre) {
		this.setNombreArchivo(nombre);
		this.setTamanoArchivo(obtenerTamanoArchivo());
	}
	@Override
	public int obtenerTamanoArchivo() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String obtenerNombreArchivo() {
		// TODO Auto-generated method stub
		return  this.getNombreArchivo();  //"File_Pruebas.pdf";
	}
	

}
