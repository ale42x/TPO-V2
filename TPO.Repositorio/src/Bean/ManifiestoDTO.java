package Bean;

import java.io.Serializable;








public class ManifiestoDTO implements Serializable {
	
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
