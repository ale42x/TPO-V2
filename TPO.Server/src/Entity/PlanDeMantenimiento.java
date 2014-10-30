package Entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;




@Entity
@Table (name="PlanDeMantenimiento")

public class PlanDeMantenimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_plan_mantenimiento;
	private  boolean Apto;
	private String descripcion;
	
	
	@ManyToMany
	@JoinTable(	name			   ="PlanTareasMantenimiento",
				joinColumns		   = @JoinColumn(name="id_plan_mantenimiento"),
				inverseJoinColumns = @JoinColumn(name="id_tarea_mantenimiento"))
	//private List<PlanDeMantenimiento> planmantenimientos = new ArrayList<PlanDeMantenimiento>();
	private List<TareaMantenimiento> tareasMantenimiento = new ArrayList<TareaMantenimiento>();
	

	public List<TareaMantenimiento> getTareasMantenimiento() {
		return tareasMantenimiento;
	}


	public void setTareasMantenimiento(List<TareaMantenimiento> tareasMantenimiento) {
		this.tareasMantenimiento = tareasMantenimiento;
	}


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


	}
