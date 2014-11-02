package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmpresaSubcontratada")
public class EmpresaSubcontratada {
	
	@Id
	private int id_EmpresaSubcontratada;
	private String RazonSocial;				
	private String CUIT;						
	private String Tipo;	
	
	//@ManyToOne (cascade=CascadeType.ALL)
	//@OneToOne
	//@JoinColumn(name="id_Envio")	
	//private Envio envio;
	
	//@OneToMany (cascade=CascadeType.ALL)
	//@JoinColumn(name="id_VehiculoSubcontratado")
	//private List<VehiculoSubcontratado> VehiculoSubcontratado = new ArrayList<VehiculoSubcontratado>();
	

	
	public int getId_EmpresaSubcontratada() {
		return id_EmpresaSubcontratada;
	}
	public void setId_EmpresaSubcontratada(int id_EmpresaSubcontratada) {
		this.id_EmpresaSubcontratada = id_EmpresaSubcontratada;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getCUIT() {
		return CUIT;
	}
	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}


	
	
	
}
