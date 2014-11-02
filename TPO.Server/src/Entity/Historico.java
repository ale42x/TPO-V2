package Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name="HistoricoMantenimiento")
public class Historico {
	
@Id
private	int id_historico ;

@ManyToOne
@JoinColumn(name="vehiculo")
private Vehiculo vehiculo;

private Date fecha;

public int getId_historico() {
	return id_historico;
}
public void setId_historico(int id_historico) {
	this.id_historico = id_historico;
}


public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
} 

}
