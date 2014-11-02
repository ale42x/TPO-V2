package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="VehiculoSubcontratado")
public class VehiculoSubcontratado {
	
	@Id
	private int 	id_VehiculoSubcontratado;	
	private float	patente;
	private float	volumen;
	private float 	peso;	
	private float 	tipo;
	
	//@ManyToOne (cascade=CascadeType.ALL)
	//private List<EmpresaSubcontratada> EmpresasSubcontratada = new ArrayList<EmpresaSubcontratada>();
	//@ManyToOne (cascade=CascadeType.ALL)
	@OneToOne
	@JoinColumn(name="id_EmpresaSubcontratada")
	private EmpresaSubcontratada empresaSubcontratada; 
	
	public int getId_VehiculoSubcontratado() {
		return id_VehiculoSubcontratado;
	}
	public void setId_VehiculoSubcontratado(int id_VehiculoSubcontratado) {
		this.id_VehiculoSubcontratado = id_VehiculoSubcontratado;
	}
	public float getPatente() {
		return patente;
	}
	public void setPatente(float patente) {
		this.patente = patente;
	}
	public float getVolumen() {
		return volumen;
	}
	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getTipo() {
		return tipo;
	}
	public void setTipo(float tipo) {
		this.tipo = tipo;
	}	

	
}
