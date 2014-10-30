package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;






public class PlanDeMantenimientoDTO implements Serializable{
	
	private int id_plan_mantenimiento;
	private  boolean Apto;
	private String descripcion;
	
	



	public int getId_plan_mantenimiento() {
		return id_plan_mantenimiento;
	}


	public void setId_plan_mantenimiento(int id_plan_mantenimiento) {
		this.id_plan_mantenimiento = id_plan_mantenimiento;
	}


	public boolean isApto() {
		return Apto;
	}


	public void setApto(boolean apto) {
		Apto = apto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


//	public List<PlanDeMantenimientoDTO> getPlanmantenimiento() {
//		return planmantenimiento;
//	}
//
//
//	public void setPlanmantenimiento(List<PlanDeMantenimientoDTO> planmantenimiento) {
//		this.planmantenimiento = planmantenimiento;
//	}
	
}
