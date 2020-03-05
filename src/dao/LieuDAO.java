package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modele.Lieu;

public class LieuDAO implements ILieuDAO {
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session session =factory.openSession();
	
	public int creat(Lieu li) {
		try {
			session.beginTransaction();
			session.saveOrUpdate(li);
			session.getTransaction().commit();
			return 1;
			
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return 0;
	}

}
	public List<Lieu> getLieux() {
		List<Lieu> form= new ArrayList<Lieu>();
		try {
			session.beginTransaction();
			form=session.createQuery("from Lieu").list();
			return form;
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return null;
			}
	}
	
	
	
	
	
	
}
