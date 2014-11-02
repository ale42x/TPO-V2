package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table (name="Manifiesto")
public class Manifiesto {
	@Id
	private int NroManifiesto; 
	private String Description;
	
	
	
	
	public int getNroManifiesto() {
		return NroManifiesto;
	}
	public void setNroManifiesto(int nroManifiesto) {
		NroManifiesto = nroManifiesto;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
