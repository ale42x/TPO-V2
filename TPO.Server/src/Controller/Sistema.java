package Controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Bean.SectorDTO;
import DAO.AreaDAO;
import Entity.Area;
import Interface.InterfaceEnvio;

public class Sistema extends UnicastRemoteObject implements InterfaceEnvio  {
	
	private static final long serialVersionUID = 1L;
	
	public Sistema() throws RemoteException {
		
		super();
		// TODO Auto-generated constructor stub
		
	}


	private static AreaDAO dao;
	static {
		dao = AreaDAO.getInstancia();
	}
	
	@Override
	public int grabarArea() throws RemoteException {
		Area area = new Area();
		
		area.setId_Area(2);
		area.setDescripcion("RRHH");
		
		dao.grabarArea(area);
		
		return area.getId_Area();
	}

	@Override
	public String leerDeposito(int id_deposito) throws RemoteException {
		
		System.out.println("Sistema");
		return dao.leerDeposito(id_deposito);
	}

	@Override
	public String leerArea(int idArea) throws RemoteException {
		
		System.out.println("Sistema");
		return dao.leerArea(idArea);
	}

	@Override
	public SectorDTO leerSector(int id_sector) throws RemoteException {
		
		return dao.leerSector(id_sector);
	}

	//Llamadas a las funciones de los DAO

}
	

