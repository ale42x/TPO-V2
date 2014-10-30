package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ClienteDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int    id_cliente;
	private int    TipoCliente;	
	private String Direccion;	
	private String Telefono;	
	private String Apellido;	
	public List<PaqueteDTO> getPaquetes() {
		return paquetes;
	}
	public void setPaquetes(List<PaqueteDTO> paquetes) {
		this.paquetes = paquetes;
	}
	private String DNI;
	private String ID_Direccion;	
	private String RazonSocial;
	private String Responsable;
	private String DeudaMaxima;
	private String Autorizacion;	
	private Date   FechaHora;

	private List<ReciboDTO> recibos = new ArrayList<ReciboDTO>();
	private List<PaqueteDTO> paquetes = new ArrayList<PaqueteDTO>();
	
	public List<ReciboDTO> getRecibos() {
		return recibos;
	}
	public void setRecibos(List<ReciboDTO> recibos) {
		this.recibos = recibos;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getTipoCliente() {
		return TipoCliente;
	}
	public void setTipoCliente(int tipoCliente) {
		TipoCliente = tipoCliente;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getID_Direccion() {
		return ID_Direccion;
	}
	public void setID_Direccion(String iD_Direccion) {
		ID_Direccion = iD_Direccion;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getResponsable() {
		return Responsable;
	}
	public void setResponsable(String responsable) {
		Responsable = responsable;
	}
	public String getDeudaMaxima() {
		return DeudaMaxima;
	}
	public void setDeudaMaxima(String deudaMaxima) {
		DeudaMaxima = deudaMaxima;
	}
	public String getAutorizacion() {
		return Autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		Autorizacion = autorizacion;
	}
	public Date getFechaHora() {
		return FechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		FechaHora = fechaHora;
	}	

	
	
}
