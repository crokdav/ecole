package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.persister.entity.Queryable;

import modele.Formation;
import modele.Lieu;

public class Formationdao implements IFormationdao {
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session session =factory.openSession();
	
	public int creat(Formation fr) {
	
		try {
			
			session.beginTransaction();
			session.save(fr);
			session.getTransaction().commit();
			return 1;
			
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return 0;
	}

}

	@Override
	public List<Formation> getFormations() {
		List<Formation> form= new ArrayList<Formation>();
		try {
			session.beginTransaction();
			String request= "select*from formation inner join lieu on formation.idlieu=lieu.idlieu order by ville";
			SQLQuery query = session.createSQLQuery(request);
			query.addEntity(Formation.class);
			form=query.list();
			session.close();
			return form;
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return null;
			}
	}
	public List<Formation> showFormations(Lieu lieu) {
		List<Formation> form= new ArrayList<Formation>();
		try {
			session.beginTransaction();
			Query query = session.createQuery("from Formation where lieu.idLieu= :idLieu");
			query.setParameter("idLieu", lieu.getidLieu());
			form=query.list();
			session.close();
			return form;
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return null;
			}
	}

	
	
}

