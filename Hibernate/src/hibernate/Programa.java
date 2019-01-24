package hibernate;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

public class Programa {

	public static void main(String[] args) {

		//newEmpresa();
		newItem();
		newPedido();

		HibernateUtilities.getSessionFactory().close();

	}

	public static void newEmpresa() {

		Session session = HibernateUtilities.getSessionFactory().openSession();

		Empresas e1 = new Empresas();
		e1.setCIF(2332);
		e1.setNombre("Ahora Prestaciones");
		e1.setEmpleados(100);
		e1.setDireccion("Calle Falsa 321");

		session.save(e1);

		session.beginTransaction().commit();
		session.getTransaction().commit();

		session.close();

	}

	public static void recuEmpresa() {
		Session session = HibernateUtilities.getSessionFactory().openSession();

		Empresas e1 = session.get(Empresas.class, "321Q");
		System.out.println("Hemos encontrado: " + e1.getCIF() + ", " + e1.getDireccion() + ", " + e1.getEmpleados()
				+ ", " + e1.getNombre());
		
		session.getTransaction().commit();
		session.close();

	}

	public static void newItem() {

		Session session = HibernateUtilities.getSessionFactory().openSession();

		Item I = new Item();

		I.setNombre("Parasetemol");
		I.setCantidad(30);

		session.save(I);

		session.beginTransaction().commit();
		session.getTransaction().commit();

		session.close();

	}

	public static void recuItem() {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		Item I = session.get(Item.class, 1);
		System.out.println("Hemos encontrado: " + I.getId() + ", "+ I.getNombre()+ ", "+ I.getCantidad());
		
		session.getTransaction().commit();
		session.close();
	}

	public static void newPedido() {
		Session session = HibernateUtilities.getSessionFactory().openSession();

		Pedido P = new Pedido();

		P.setFecha(new Date());
				
		session.save(P);

		session.beginTransaction().commit();
		session.getTransaction().commit();

		session.close();

	}

	public static void recuPedido() {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		Pedido P = session.get(Pedido.class, 1);
		System.out.println("Hemos encontrado: " + P.getId() + ", "+ P.getFecha());
		
		session.getTransaction().commit();
		session.close();
	}
}
