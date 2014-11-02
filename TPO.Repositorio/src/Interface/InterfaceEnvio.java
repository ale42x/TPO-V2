package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import Bean.*;

public interface InterfaceEnvio extends Remote {

	public int grabarArea() throws RemoteException;

	public String leerDeposito(int id_deposito)throws RemoteException;

	public String leerArea(int idArea)throws RemoteException;

	public SectorDTO leerSector(int i) throws RemoteException;
	
}
