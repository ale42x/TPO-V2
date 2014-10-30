package Bean;

import java.sql.Date;


public class RemitoDTO {
	
	
	private int id_remito;
	private ManifiestoDTO manifiesto;
	private SucursalDTO Id_SucOrigen;
	private SucursalDTO  id_SucDestino;
	private Date FechaEntrega ;
	private Date FechaMaxima ;
	private String CondicionesEspeciales;
	
	
	
	
	public int getId_remito() {
		return id_remito;
	}
	public void setId_remito(int id_remito) {
		this.id_remito = id_remito;
	}
	public ManifiestoDTO getManifiesto() {
		return manifiesto;
	}
	public void setManifiesto(ManifiestoDTO manifiesto) {
		this.manifiesto = manifiesto;
	}

	public SucursalDTO getId_SucOrigen() {
		return Id_SucOrigen;
	}
	public void setId_SucOrigen(SucursalDTO id_SucOrigen) {
		Id_SucOrigen = id_SucOrigen;
	}
	public SucursalDTO getId_SucDestino() {
		return id_SucDestino;
	}
	public void setId_SucDestino(SucursalDTO id_SucDestino) {
		this.id_SucDestino = id_SucDestino;
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
