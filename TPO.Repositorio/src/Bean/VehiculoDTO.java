package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class VehiculoDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int id_vehiculo ;
	private String Tipo;
	private List<PlanDeMantenimientoDTO> plan_mantenimientos = new ArrayList<PlanDeMantenimientoDTO>();
	private float volumenTransportado; 
	private float Peso;
	private float Tara;
	private String CondicionesEspeciales; 
	private String Patente;
	private float Kilometraje;
	private List<HistoricoDTO> historicos = new ArrayList<HistoricoDTO>();
	
	public int getId_vehiculo() {
		return id_vehiculo;
	}
	
	
	
	
	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public List<PlanDeMantenimientoDTO> getPlan_mantenimientos() {
		return plan_mantenimientos;
	}




	public void setPlan_mantenimientos(
			List<PlanDeMantenimientoDTO> plan_mantenimientos) {
		this.plan_mantenimientos = plan_mantenimientos;
	}




	public List<HistoricoDTO> getHistoricos() {
		return historicos;
	}




	public void setHistoricos(List<HistoricoDTO> historicos) {
		this.historicos = historicos;
	}




	public float getVolumenTransportado() {
		return volumenTransportado;
	}
	public void setVolumenTransportado(float volumenTransportado) {
		this.volumenTransportado = volumenTransportado;
	}
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float peso) {
		Peso = peso;
	}
	public float getTara() {
		return Tara;
	}
	public void setTara(float tara) {
		Tara = tara;
	}
	public String getCondicionesEspeciales() {
		return CondicionesEspeciales;
	}
	public void setCondicionesEspeciales(String condicionesEspeciales) {
		CondicionesEspeciales = condicionesEspeciales;
	}
	public String getPatente() {
		return Patente;
	}
	public void setPatente(String patente) {
		Patente = patente;
	}
	public float getKilometraje() {
		return Kilometraje;
	}
	public void setKilometraje(float kilometraje) {
		Kilometraje = kilometraje;
	}

	
}
