package Bean;

import java.io.Serializable;
import java.sql.Date;






public class HistoricoDTO implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private	int id_historico ;

private int id_vehiculo	;
private Date fecha;

public int getId_historico() {
	return id_historico;
}
public void setId_historico(int id_historico) {
	this.id_historico = id_historico;
}
public int getId_vehiculo() {
	return id_vehiculo;
}
public void setId_vehiculo(int id_vehiculo) {
	this.id_vehiculo = id_vehiculo;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}


}
