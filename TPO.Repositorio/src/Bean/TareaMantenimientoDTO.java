package Bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class TareaMantenimientoDTO implements Serializable{
	

	private static final long serialVersionUID = 1L;

	private int id_tarea_mantenimiento;
	
	private List<PlanDeMantenimientoDTO> articulos = new ArrayList<PlanDeMantenimientoDTO>();
	
	private  String Descripcion;
	
	
	
	public int getId_tarea_mantenimiento() {
		return id_tarea_mantenimiento;
	}
	public List<PlanDeMantenimientoDTO> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<PlanDeMantenimientoDTO> articulos) {
		this.articulos = articulos;
	}
	public void setId_tarea_mantenimiento(int id_tarea_mantenimiento) {
		this.id_tarea_mantenimiento = id_tarea_mantenimiento;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getTiempo() {
		return Tiempo;
	}
	public void setTiempo(int tiempo) {
		Tiempo = tiempo;
	}
	private int Tiempo ;


	
}
