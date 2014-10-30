package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table (name="Ruta")
public class Ruta {
	
	@Id
	
	private int id_Ruta;
	private String origen;
	private String destino;
	public List<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

	private String duracion;
	private String camino;
	
	@Column(name="Distancia")
	private float km;

	@ManyToMany
	@JoinTable(name		="SucursalRuta",
	joinColumns 		= @JoinColumn(name="id_Ruta"),
	inverseJoinColumns 	= @JoinColumn(name="id_Sucursal"))	
	private List<Sucursal> sucursales = new ArrayList<Sucursal>();
	
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
