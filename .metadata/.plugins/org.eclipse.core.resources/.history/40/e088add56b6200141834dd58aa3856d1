package Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import Bean.AreaDTO;

@Entity
@Table (name="Empleado")
public class Empleado {

	@Id
	private int id_Empleado;
	@ManyToMany
	@JoinTable(name		="Sucursal_has_Empleado",
	joinColumns 		= @JoinColumn(name="id_Empleado"),
	inverseJoinColumns 	= @JoinColumn(name="id_Sucursal"))	
	private List<Sucursal> sucursales = new ArrayList<Sucursal>();
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_Area")
	private Area area;
	
	private String nombre;
	private String apellido;
	private String cargo;
	
	public int getId_Empleado() {
		return id_Empleado;
	}
	public void setId_Empleado(int id_Empleado) {
		this.id_Empleado = id_Empleado;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
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
