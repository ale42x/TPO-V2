package Bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class PaqueteDTO  implements Serializable {
			
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SucursalDTO getDestino() {
		return destino;
	}
	private int 	 id_Paquete;		
	private int 	 NroPaqute;			
	private String 	 Clase;				
	private String 	 TipoCarga;			
	private float 	 Alto;			
	private float 	 Lar;			
	private float 	 Ancho;			
	private float 	 Peso;		
	private float 	 Volumen;	
	private String 	 Tratamiento;
	private String 	 Fragilidad;
	private int  	 Apilable;
	private int  	 ApilableCantidad;
	private Date 	 FechaEntrega;
	private String 	 CoordenadaGps;
	private int 	 Id_remito;
	private int 	 id_Manifiesto;
	private ReciboDTO recibo;
	private ClienteDTO	 cliente;
	
	public ReciboDTO getRecibo() {
		return recibo;
	}
	public void setRecibo(ReciboDTO recibo) {
		this.recibo = recibo;
	}
	public ClienteDTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	public SucursalDTO getOrigen() {
		return origen;
	}
	public void setOrigen(SucursalDTO origen) {
		this.origen = origen;
	}
	
	public void setDestino(SucursalDTO destino) {
		this.destino = destino;
	}
	private SucursalDTO origen;  
	private SucursalDTO destino;
	private String   Refrigerada;
	private String 	 Manipulacion;
	private String   Estado;
	private String   Observaciones;
	
	
	public int getId_Paquete() {
		return id_Paquete;
	}
	public void setId_Paquete(int id_Paquete) {
		this.id_Paquete = id_Paquete;
	}
	public int getNroPaqute() {
		return NroPaqute;
	}
	public void setNroPaqute(int nroPaqute) {
		NroPaqute = nroPaqute;
	}
	public String getClase() {
		return Clase;
	}
	public void setClase(String clase) {
		Clase = clase;
	}
	public String getTipoCarga() {
		return TipoCarga;
	}
	public void setTipoCarga(String tipoCarga) {
		TipoCarga = tipoCarga;
	}
	public float getAlto() {
		return Alto;
	}
	public void setAlto(float alto) {
		Alto = alto;
	}
	public float getLar() {
		return Lar;
	}
	public void setLar(float lar) {
		Lar = lar;
	}
	public float getAncho() {
		return Ancho;
	}
	public void setAncho(float ancho) {
		Ancho = ancho;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}
	public float getVolumen() {
		return Volumen;
	}
	public void setVolumen(float volumen) {
		Volumen = volumen;
	}

	public int getApilable() {
		return Apilable;
	}
	public void setApilable(int apilable) {
		Apilable = apilable;
	}
	public int getApilableCantidad() {
		return ApilableCantidad;
	}
	public void setApilableCantidad(int apilableCantidad) {
		ApilableCantidad = apilableCantidad;
	}
	public Date getFechaEntrega() {
		return FechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}
	public String getCoordenadaGps() {
		return CoordenadaGps;
	}
	public void setCoordenadaGps(String coordenadaGps) {
		CoordenadaGps = coordenadaGps;
	}
	public int getId_remito() {
		return Id_remito;
	}
	public void setId_remito(int id_remito) {
		Id_remito = id_remito;
	}
	public int getId_Manifiesto() {
		return id_Manifiesto;
	}
	public void setId_Manifiesto(int id_Manifiesto) {
		this.id_Manifiesto = id_Manifiesto;
	}

	public String getRefrigerada() {
		return Refrigerada;
	}
	public void setRefrigerada(String refrigerada) {
		Refrigerada = refrigerada;
	}
	public String getManipulacion() {
		return Manipulacion;
	}
	public void setManipulacion(String manipulacion) {
		Manipulacion = manipulacion;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	public String getTratamiento() {
		return Tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		Tratamiento = tratamiento;
	}
	public String getFragilidad() {
		return Fragilidad;
	}
	public void setFragilidad(String fragilidad) {
		Fragilidad = fragilidad;
	}


}
