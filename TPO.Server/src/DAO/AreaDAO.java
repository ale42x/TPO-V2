package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Entity.Area;
import Entity.Deposito;
import HBT.HibernateUtil;

public class AreaDAO {

	private static AreaDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static AreaDAO getInstancia(){
		if(instancia == null){
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
		System.out.println("id deposito a leer antes de abrir la session " + id_deposito);
		Session session2 = sf.openSession();
		System.out.println("id deposito despues de la session " + id_deposito);
		//Deposito deposito = (Deposito) session.createQuery("from Deposito where id_deposito = :id").setParameter(id_deposito, "id").uniqueResult();
		Deposito deposito = (Deposito) session2.load(Deposito.class, id_deposito);
		
		session2.close();
		return deposito.getDescripcion();
	}

	public String leerArea(int idArea) {
		
		Area area = new Area();
		area.setId_Area(idArea);
		
		Session session = sf.openSession();
		//session.load(area, getClass());
		session.get(Area.class, idArea);
		
		return area.getDescripcion();
	}
	
}