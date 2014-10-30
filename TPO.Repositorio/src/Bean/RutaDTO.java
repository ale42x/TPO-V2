package Bean;

import java.io.Serializable;

public class RutaDTO implements Serializable{
	
	private int id_Ruta;
	private String origen;
	private String destino;
	private String duracion;
	private String camino;
	private float km;
	
	public RutaDTO(int id_Ruta, String origen, String destino, String duracion,
			String camino, float km) {
		super();
		this.id_Ruta = id_Ruta;
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
		this.camino = camino;
		this.km = km;
	}

	public int getId_Ruta() {
		return id_Ruta;
	}

	public void setId_Ruta(int id_Ruta) {
		this.id_Ruta = id_Ruta;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getCamino() {
		return camino;
	}

	public void setCamino(String camino) {
		this.camino = camino;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}
	
	

}
