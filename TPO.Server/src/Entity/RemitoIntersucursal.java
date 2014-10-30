package Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table (name="RemitoIntersucursal")
public class RemitoIntersucursal {
	
	
	@Id
	private int id_remito_intersucursal;
	@OneToOne
	@JoinColumn(name="SucOrigen")
	private Sucursal SucOrigen;
	@OneToOne
	@JoinColumn(name="SucDestino")
	private Sucursal SucDestino ;

	@OneToOne
	@JoinColumn(name="id_vehiculo")
	private Vehiculo Vehiculo;
	
	private Date FechaSalida ;
	private Date FechaLlegada;
	@ManyToMany
	@JoinTable(name		="TrackingRemitoIntersucursal",
	joinColumns 		= @JoinColumn(name="id_remitointersucursal"),
	inverseJoinColumns 	= @JoinColumn(name="id_tracking"))	
	private List<Tracking> trackings = new ArrayList<Tracking>();
	
	@ManyToMany
	@JoinTable(name		="PaqueteRemitoIntersucursal",
	joinColumns 		= @JoinColumn(name="id_remitointersucursal"),
	inverseJoinColumns 	= @JoinColumn(name="id_paquete"))	
	private List<Paquete> paquetes = new ArrayList<Paquete>();
	
	public int getId_remito_intersucursal() {
		return id_remito_intersucursal;
	}
	public void setId_remito_intersucursal(int id_remito_intersucursal) {
		this.id_remito_intersucursal = id_remito_intersucursal;
	}
	public Sucursal getSucOrigen() {
		return SucOrigen;
	}
	public void setSucOrigen(Sucursal sucOrigen) {
		SucOrigen = sucOrigen;
	}
	public Sucursal getSucDestino() {
		return SucDestino;
	}
	public void setSucDestino(Sucursal sucDestino) {
		SucDestino = sucDestino;
	}
	public Vehiculo getVehiculo() {
		return Vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		Vehiculo = vehiculo;
	}
	public Date getFechaSalida() {
		return FechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		FechaSalida = fechaSalida;
	}
	public Date getFechaLlegada() {
		return FechaLlegada;
	}
	public void setFechaLlegada(Date fechaLlegada) {
		FechaLlegada = fechaLlegada;
	}
	public List<Tracking> getTrackings() {
		return trackings;
	}
	public void setTrackings(List<Tracking> trackings) {
		this.trackings = trackings;
	}
	
}
