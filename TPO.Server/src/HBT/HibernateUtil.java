package HBT;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import Entity.*;


public class HibernateUtil {
	public static SessionFactory sessionFactory;
	
	static {
		try
		{
			AnnotationConfiguration config = new AnnotationConfiguration();
            //config.addAnnotatedClass(XXXEntity.class);
			config.addAnnotatedClass(Area.class);
			config.addAnnotatedClass(Cliente.class);
			config.addAnnotatedClass(Deposito.class);
			config.addAnnotatedClass(Destinatario.class);
			config.addAnnotatedClass(Empleado.class);
			config.addAnnotatedClass(EmpresaSubcontratada.class);
			config.addAnnotatedClass(Envio.class);
			config.addAnnotatedClass(Historico.class);
			config.addAnnotatedClass(Manifiesto.class);
			config.addAnnotatedClass(Paquete.class);
			config.addAnnotatedClass(PlanDeMantenimiento.class);
			config.addAnnotatedClass(Recibo.class);
			config.addAnnotatedClass(Remito.class);
			config.addAnnotatedClass(RemitoIntersucursal.class);
			config.addAnnotatedClass(Ruta.class);
			config.addAnnotatedClass(Sector.class);
			config.addAnnotatedClass(Sucursal.class);
			config.addAnnotatedClass(TareaMantenimiento.class);
			config.addAnnotatedClass(Tracking.class);
			config.addAnnotatedClass(Vehiculo.class);
			config.addAnnotatedClass(VehiculoSubcontratado.class);
            sessionFactory = config.buildSessionFactory();
       }
       catch (Throwable ex)
       {
           System.err.println("Initial SessionFactory creation failed." + ex);
           throw new ExceptionInInitializerError(ex);
       }
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}

