package Bean;

import java.io.Serializable;
import java.util.List;

public class AreaDTO implements Serializable{
	
	private int id_Area;
	private String descripcion;

	
	public AreaDTO(int id_Area, String descripcion) {
		super();
		this.id_Area = id_Area;
		this.descripcion = descripcion;
	}

	public int getId_Area() {
		return id_Area;
	}

	public void setId_Area(int id_Area) {
		this.id_Area = id_Area;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	
	

}
