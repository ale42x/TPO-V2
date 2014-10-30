package Bean;

import java.io.Serializable;


public class VehiculoSubcontratadoDTO  implements Serializable {

private static final long serialVersionUID = 1L;

	private float	patente;
	private float	volumen;
	private float 	peso;	
	private float 	tipo;
	
	
	public float getPatente() {
		return patente;
	}
	public void setPatente(float patente) {
		this.patente = patente;
	}
	public float getVolumen() {
		return volumen;
	}
	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getTipo() {
		return tipo;
	}
	public void setTipo(float tipo) {
		this.tipo = tipo;
	}	

	
}
