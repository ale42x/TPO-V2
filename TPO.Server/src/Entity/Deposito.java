package Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table (name="Deposito")
public class Deposito implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id_Deposito;
	private String 	descripcion;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_Deposito")
	private List<Sector> sectores = new ArrayList<Sector>();
	
	//@OneToOne
	//@OneToOne(cascade = CascadeType.ALL)
    //@PrimaryKeyJoinColumn
	//@JoinColumn(name="id_Sucursal")
	//private Sucursal sucursal;
	//@OneToOne(mappedBy = "Deposito")
	@OneToOne//(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Sucursal sucursal;
	
	
	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	public int getId_Deposito() {
		return id_Deposito;
	}

	public void setId_Deposito(int id_Deposito) {
		this.id_Deposito = id_Deposito;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Sector> getSectores() {
		return sectores;
	}

	public void setSectores(List<Sector> sectores) {
		this.sectores = sectores;
	}
	
	

}
