package Entity;

import java.sql.Date;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;


@Entity
@Table (name="Remito")
public class Remito {
	
	@Id
	private int id_remito;
	
	@OneToOne(cascade=CascadeType.ALL )
	private Manifiesto manifiesto;
	
	@OneToOne(cascade=CascadeType.ALL)
	private  Sucursal SucOrigen;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Sucursal  SucDestino;
	
	private Date FechaEntrega ;
	private Date FechaMaxima ;
	private String CondicionesEspeciales;
	
	
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
		
	public int getId_remito() {
		return id_remito;
	}
	public void setId_remito(int id_remito) {
		this.id_remito = id_remito;
	}
	public Manifiesto getManifiesto() {
		return manifiesto;
	}
	public void setManifiesto(Manifiesto manifiesto) {
		this.manifiesto = manifiesto;
	}

	public Date getFechaEntrega() {
		return FechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}
	public Date getFechaMaxima() {
		return FechaMaxima;
	}
	public void setFechaMaxima(Date fechaMaxima) {
		FechaMaxima = fechaMaxima;
	}
	public String getCondicionesEspeciales() {
		return CondicionesEspeciales;
	}
	public void setCondicionesEspeciales(String condicionesEspeciales) {
		CondicionesEspeciales = condicionesEspeciales;
	}

}
