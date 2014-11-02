package Bean;

import java.io.Serializable;
import java.util.List;

public class DepositoDTO implements Serializable{
	
	private int id_Deposito;
	private String 	descripcion;
	private List<SectorDTO> sectores;
	
	public DepositoDTO() {
        super();
        // TODO Auto-generated constructor stub
}
	
	public DepositoDTO(int id_Deposito, String descripcion,
			List<SectorDTO> sectores) {
		super();
		this.id_Deposito = id_Deposito;
		this.descripcion = descripcion;
		this.sectores = sectores;
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

	public List<SectorDTO> getSectores() {
		return sectores;
	}

	public void setSectores(List<SectorDTO> sectores) {
		this.sectores = sectores;
	}
	
	
	

}
