package Bean;

import java.util.ArrayList;
import java.util.List;




public class DestinatarioDTO {


	private int id_Destinatatio;
	private String dni;
	private String nombre;
	private String apellido;
	private String direccion;
	
	
	private List<PaqueteDTO> paquetes = new ArrayList<PaqueteDTO>();	
	
	
	

	public List<PaqueteDTO> getPaquetes() {
		return paquetes;
	}
	public void setPaquetes(List<PaqueteDTO> paquetes) {
		this.paquetes = paquetes;
	}
	public int getId_Destinatatio() {
		return id_Destinatatio;
	}
	public void setId_Destinatatio(int id_Destinatatio) {
		this.id_Destinatatio = id_Destinatatio;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
