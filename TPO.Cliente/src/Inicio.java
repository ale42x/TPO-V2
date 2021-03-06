import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

import Bean.DepositoDTO;
import Bean.SectorDTO;
import Bean.SucursalDTO;
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
    		//System.setProperty("java.security.policy","C:/Users/Diego/workspace/Repo2/TPO-V2/TPO.Server/src/security.policy");
    		
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
    /*		String desc = remoteInterface.leerArea(1); 
    		System.out.println(desc);
    */	
    		// Leo un Sector
    		System.out.println("Leo un Sector");
    		SectorDTO sector = remoteInterface.leerSector(1);
    		System.out.println("sector"+sector.getDescripcion());
    		
    		//leo deposito 2 pablo
    		System.out.println("leo deposito 2 pablo");
    		DepositoDTO deposito  = remoteInterface.leerDeposito2(1);
    		
    		//Leo la sucursal
    		System.out.println("Leo la sucursal");
    		SucursalDTO sucursal = remoteInterface.leetSucursal(1);
    		System.out.println("Sucursal"+sucursal.getNombreSucursal());
    		
    		//Leo un deposito
    		System.out.println("Leo un deposito");
    		String depo = remoteInterface.leerDeposito(1);
    		System.out.println(depo);
    	}
	}

}
