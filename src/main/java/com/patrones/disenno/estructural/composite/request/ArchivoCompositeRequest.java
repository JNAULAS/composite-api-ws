/**
 * 
 */
package com.patrones.disenno.estructural.composite.request;

import com.patrones.disenno.estructural.composite.model.TipoDocumento;

/**
 * @author juannaula
 *
 */
public class ArchivoCompositeRequest {
	private TipoDocumento tipoDocumento;
	private String nombreArchivo;
	private int tamanno;
	
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public int getTamanno() {
		return tamanno;
	}
	public void setTamanno(int tamanno) {
		this.tamanno = tamanno;
	}
	

}
