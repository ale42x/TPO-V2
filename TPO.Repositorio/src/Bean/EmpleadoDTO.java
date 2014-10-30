package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class EmpleadoDTO implements Serializable{
	
	private int id_Empleado;
	private AreaDTO area;
	private String nombre;
	private String apellido;
	private String cargo;
	private List<SucursalDTO> sucursales = new ArrayList<SucursalDTO>();
	
	public EmpleadoDTO(int id_Empleado, AreaDTO area, String nombre,
			String apellido, String cargo) {
		super();
		this.id_Empleado = id_Empleado;
		this.area = area;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
	}

	public int getId_Empleado() {
		return id_Empleado;
	}

	public void setId_Empleado(int id_Empleado) {
		this.id_Empleado = id_Empleado;
	}

	public AreaDTO getArea() {
		return area;
	}

	public void setArea(AreaDTO area) {
		this.area = area;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
