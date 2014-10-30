package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class EmpresaSubcontratadaDTO implements Serializable   {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_EmpresaSubcontratada;
	private String RazonSocial;				
	private String CUIT;						
	private String Tipo;						
	public int getId_EmpresaSubcontratada() {
		return id_EmpresaSubcontratada;
	}
	public void setId_EmpresaSubcontratada(int id_EmpresaSubcontratada) {
		this.id_EmpresaSubcontratada = id_EmpresaSubcontratada;
	}
	private List<EnvioDTO> envios = new ArrayList<EnvioDTO>();
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setVehiculoSubcontratado(
			VehiculoSubcontratadoDTO vehiculoSubcontratado) {
	}
	public List<EnvioDTO> getEnvios() {
		return envios;
	}
	public void setEnvios(List<EnvioDTO> envios) {
		this.envios = envios;
	}
	public List<VehiculoSubcontratadoDTO> getVehiculoSubcontratado() {
		return VehiculoSubcontratado;
	}
	public void setVehiculoSubcontratado(
			List<VehiculoSubcontratadoDTO> vehiculoSubcontratado) {
		VehiculoSubcontratado = vehiculoSubcontratado;
	}
	private List<VehiculoSubcontratadoDTO> VehiculoSubcontratado = new ArrayList<VehiculoSubcontratadoDTO>();

	

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
