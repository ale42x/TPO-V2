package Bean;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;



public class TrackingDTO implements Serializable{
		
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int IDtracking;
	
	private int Id_Vehiculo;
	private RemitoDTO Remito;
	private Date Fecha;
	private Time Hora;
	private String CoordenadaGPS ;
	public int getIDtracking() {
		return IDtracking;
	}
	public void setIDtracking(int iDtracking) {
		IDtracking = iDtracking;
	}
	public int getId_Vehiculo() {
		return Id_Vehiculo;
	}
	public void setId_Vehiculo(int id_Vehiculo) {
		Id_Vehiculo = id_Vehiculo;
	}
	public RemitoDTO getRemito() {
		return Remito;
	}
	public void setRemito(RemitoDTO remito) {
		Remito = remito;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public Time getHora() {
		return Hora;
	}
	public void setHora(Time hora) {
		Hora = hora;
	}
	public String getCoordenadaGPS() {
		return CoordenadaGPS;
	}
	public void setCoordenadaGPS(String coordenadaGPS) {
		CoordenadaGPS = coordenadaGPS;
	}
	
	
}
