import java.net.MalformedURLException;
import java.rmi.*;
import java.util.List;

import Interface.Constants;
import Interface.InterfaceEnvio;


public class Inicio {
	private InterfaceEnvio remoteInterface;
	public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException
	{
		new Inicio();
	}
	
    public boolean getStub() {
    	
    	try {
    		//System.setProperty("java.security.policy","C:/Users/Pablo/Desktop/UADE/2014/2do Cuatrimestre/Aplicaciones Distribuidas/2C2014/TPO/Code/TPO.Cliente/src/security.policy");
    		System.setProperty("java.security.policy","E:/Ale/JAVA/UADE/TPO/TPO V2/TPO.Server/src/security.policy");
    		if(System.getSecurityManager()==null)
    			System.setSecurityManager(new RMISecurityManager());
    		//remoteInterface = (InterfaceEnvio)Naming.lookup("//localhost/" + Constants.RMI_ID);
    		remoteInterface = (InterfaceEnvio)Naming.lookup("//localhost/TPOV2");
			
    		return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
    }
	
    public Inicio() throws RemoteException{
    	if(getStub()){
			
			//Llamada a las interfaces...
    	
   // 		System.out.println("Antes de grabar");
   // 		//Creo 1 area nueva
   // 		int codArea = remoteInterface.grabarArea(); 
   //		System.out.println(codArea);
    		// Leo un area
    		String desc = remoteInterface.leerArea(1); 
    		System.out.println(desc);
    		
    		//Leo un deposito
    		String depo = remoteInterface.leerDeposito(1);
    		System.out.println(depo);
    	}
	}

}
