package com.patrones.disenno.estructural.composite.dto;

import com.patrones.disenno.estructural.composite.model.TipoDocumento;

public class ArchivoDTO {
    private TipoDocumento tipoDocumento;
	private String nombreArchivo;
	private String nombreCarpeta;
	private int tamano;
	private int tamanoCarpeta;
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public String getNombreCarpeta() {
		return nombreCarpeta;
	}
	public void setNombreCarpeta(String nombreCarpeta) {
		this.nombreCarpeta = nombreCarpeta;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	public int getTamanoCarpeta() {
		return tamanoCarpeta;
	}
	public void setTamanoCarpeta(int tamañoCarpeta) {
		this.tamanoCarpeta = tamañoCarpeta;
	}
}
