package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SucursalDTO  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<RutaDTO> getRutas() {
		return rutas;
	}

	public void setRutas(List<RutaDTO> rutas) {
		this.rutas = rutas;
	}

	private int id_Sucursal;
	private String NombreSucursal;
	private String Provincia;
	private String CP;
	private String telefono;
	private DepositoDTO deposito;
	private List<EmpleadoDTO> empleados;
	private List<RutaDTO> rutas = new ArrayList<RutaDTO>();
	
	public SucursalDTO(int id_Sucursal, String nombreSucursal,
			String provincia, String cP, String telefono, DepositoDTO deposito) {
		super();
		this.id_Sucursal = id_Sucursal;
		NombreSucursal = nombreSucursal;
		Provincia = provincia;
		CP = cP;
		this.telefono = telefono;
		this.deposito = deposito;
	}

	public int getId_Sucursal() {
		return id_Sucursal;
	}

	public void setId_Sucursal(int id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}

	public String getNombreSucursal() {
		return NombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		NombreSucursal = nombreSucursal;
	}

	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}

	public String getCP() {
		return CP;
	}

	public void setCP(String cP) {
		CP = cP;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public DepositoDTO getDeposito() {
		return deposito;
	}

	public void setDeposito(DepositoDTO deposito) {
		this.deposito = deposito;
	}

	public List<EmpleadoDTO> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<EmpleadoDTO> empleados) {
		this.empleados = empleados;
	}
	
	

}
