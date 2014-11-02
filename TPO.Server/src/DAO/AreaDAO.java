package DAO;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Bean.SectorDTO;
import Entity.Area;
import Entity.Deposito;
import Entity.Sector;
import HBT.HibernateUtil;

public class AreaDAO {

	private static AreaDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static AreaDAO getInstancia(){
		if(instancia == null){
			System.out.println("id deposito despues de la session ");
			sf = HibernateUtil.getSessionFactory();
			instancia = new AreaDAO();
		}
		return instancia;
	}

	public void grabarArea(Area area) {
		
		
		System.out.println("AREA DAO");
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.persist(area);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}
	
	public String leerDeposito(int id_deposito) {
		Session session2 = sf.openSession();
		session2.beginTransaction();
				
		System.out.println("id deposito despues de la session "+id_deposito);
		//Deposito deposito = (Deposito) session.createQuery("from Deposito where id_deposito = :id").setParameter(id_deposito, "id").uniqueResult();
		//Deposito deposito = (Deposito) session2.load(Deposito.class, id_deposito);
		Deposito depo = new Deposito();
		depo.setSucursal(null);
		depo = (Deposito) session2.createQuery("select descripcion from Deposito where id_Deposito = :id").setParameter("id", id_deposito).uniqueResult();
		//Deposito deposito = (Deposito) session2.createQuery("select descripcion from Deposito where id_Deposito = :id").setParameter("id", id_deposito).uniqueResult();
		//String depo = (String) session2.createQuery("select descripcion from Deposito where id_Deposito = :id").setParameter("id", id_deposito).uniqueResult();
		session2.flush();
		session2.close();
		
		return depo.getDescripcion();
		//return deposito.getDescripcion();
		//return depo;
	}

	public String leerArea(int idArea) {
		
		Session session = sf.openSession();
		
		Area area = new Area();
		area.setId_Area(idArea);
		
		System.out.println("open session"+idArea);
		
		
		//session.load(area, getClass());
		session.get(Area.class, idArea);
		
		return area.getDescripcion();
	}

	public SectorDTO leerSector(int id_sector) {
		Sector sector = new Sector();
		sector.setId_Sector(id_sector);
		
		Session session = sf.openSession();
		//sector = (Sector) session.load(Sector.class, sector.getId_Sector());
		//sector = (Sector) session.get(Sector.class,sector.getId_Sector());
		System.out.println("Sector query "+id_sector);
		sector = (Sector) session.createQuery("from Sector where id_Sector = :id").setParameter("id", id_sector).uniqueResult();
		
		SectorDTO dto = new SectorDTO(sector.getId_Sector(), sector.getGondola(), sector.getNumero(), sector.getDescripcion(), sector.getCondicionEspecial());
		
		return dto;
	}
	
}
