package Bean;

import java.io.Serializable;

public class SectorDTO implements Serializable{
	
	private int id_Sector;
	private int gondola;
	private int numero;
	private String descripcion;
	private String condicionEspecial;
	
	public SectorDTO(int id_Sector, int gondola, int numero,
			String descripcion, String condicionEspecial) {
		super();
		this.id_Sector = id_Sector;
		this.gondola = gondola;
		this.numero = numero;
		this.descripcion = descripcion;
		this.condicionEspecial = condicionEspecial;
	}

	public int getId_Sector() {
		return id_Sector;
	}

	public void setId_Sector(int id_Sector) {
		this.id_Sector = id_Sector;
	}

	public int getGondola() {
		return gondola;
	}

	public void setGondola(int gondola) {
		this.gondola = gondola;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCondicionEspecial() {
		return condicionEspecial;
	}

	public void setCondicionEspecial(String condicionEspecial) {
		this.condicionEspecial = condicionEspecial;
	}
	
	
	

}
