package model;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ValuuttaAccessObject implements IValuuttaDAO {
	private SessionFactory istuntotehdas= null;
	private boolean palautus = false;
	
	public ValuuttaAccessObject() {
		
		try {
		istuntotehdas = new Configuration().configure().buildSessionFactory();
		
		}catch(Exception e) {
			System.err.println("Istuntotehtaan luonti epäonnistui: " + e.getMessage());
			System.exit(-1);
		}	
	}
	
	public void finalize() {
		try {
			if(istuntotehdas !=null)
			istuntotehdas.close();
			
		}catch (Exception e) {
			System.err.println("Istuntotehtaan sulkeminen epäonnistui " + e.getMessage());
		}
	} 
	
	
	
	@Override
	public boolean createValuutta(Valuutta valuutta) {
		
		Transaction transaktio = null;
		try(Session istunto = istuntotehdas.openSession()){
		transaktio = istunto.beginTransaction();
		Valuutta valuuttayks = new Valuutta();
		istunto.saveOrUpdate(valuuttayks);
		transaktio.commit();
		palautus = true;
		}catch(HibernateException e) {
            if(transaktio!=null)transaktio.rollback();
            e.printStackTrace();
        }
		
		
		return palautus;
	}

	@Override
	public Valuutta readValuutta(String tunnus) {
		Valuutta valuutat = new Valuutta();
		Transaction transaktio = null;
		try (Session istunto = istuntotehdas.openSession()){
			transaktio = istunto.beginTransaction();
			istunto.load(valuutat, tunnus);
			istunto.getTransaction().commit();
			istunto.close();	
			
		}catch(HibernateException e) {
            if(transaktio!=null)transaktio.rollback();
            e.printStackTrace();
        }
		return valuutat;	
	}

	@Override
	public Valuutta[] readValuutat() {
		Transaction transaktio = null;
		Valuutta[] valuuttalista = null;
		int indeksi = 0;
		try(Session istunto = istuntotehdas.openSession()){
			transaktio = istunto.beginTransaction();
			List<Valuutta> valuuttalist = istunto.createQuery("from valuutta").getResultList(); 
			valuuttalista = new Valuutta[valuuttalist.size()];
			
			for (Valuutta v: valuuttalist) {
				valuuttalista[indeksi] = v;
				indeksi++;
			}
		}catch(HibernateException e) {
            if(transaktio!=null)transaktio.rollback();
            e.printStackTrace();
        }
		return valuuttalista;
	}

	@Override
	public boolean updateValuutta(Valuutta valuutta) {
		Transaction transaktio = null;
		try(Session istunto = istuntotehdas.openSession()){
			istunto.beginTransaction();
			istunto.update(valuutta);
			istunto.getTransaction().commit();
			palautus = true;
		}catch(HibernateException e) {
            if(transaktio!=null)transaktio.rollback();
            e.printStackTrace();
        }
		return palautus;
	}

	@Override
	public boolean deleteValuutta(String tunnus) {
		Transaction transaktio = null;
		Valuutta valuutta = new Valuutta();
		try(Session istunto = istuntotehdas.openSession()){
			istunto.beginTransaction();
			istunto.load(valuutta,tunnus);
			
			if(valuutta != null) {
				istunto.delete(valuutta);
				palautus = true;
			}
			
		}catch(HibernateException e) {
            if(transaktio!=null)transaktio.rollback();
            e.printStackTrace();
        }
		return palautus;
	}

}
