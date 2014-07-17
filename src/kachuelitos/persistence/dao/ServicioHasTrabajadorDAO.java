package kachuelitos.persistence.dao;

import java.util.Iterator;
import java.util.List;

import kachuelitos.persistence.entity.SessionFactoryUtil;
import kachuelitos.persistence.entity.ServicioHasTrabajador;
import kachuelitos.persistence.entity.User;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ServicioHasTrabajadorDAO {

	private SessionFactory session;

	public ServicioHasTrabajadorDAO() {			
		session = SessionFactoryUtil.getInstance();
	}

	
	public List<ServicioHasTrabajador> getAllServicioHasTrab(){

		/*
		connectionDB();
		ResultSet result = queryDB("select * from user");
		ArrayList<User> alUser;

		if(result == null){
			alUser = null;
		}
		else{
			alUser = new ArrayList<>();

			try {
				while(result.next()){

					alUser.add(new User(result.getInt("DNIUser"), result.getString("ContraseñaUser"), 
							result.getString("NombreUser"), result.getString("ApellidoUser"), result.getString("CorreoUser"), result.getInt("Ubigeo_idUbigeo1"),
							result.getString("TelefonoUser"), result.getString("DireccionUser"), result.getInt("Trabajador")));

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		disconnectionDB();
		*/
		
		Session s = session.getCurrentSession();
		
		Transaction trans=s.beginTransaction();
		List<ServicioHasTrabajador> listServicioHasTrab = (List<ServicioHasTrabajador>)s.createQuery("from ServicioHasTrabajador").list();
	
		trans.commit();

		return listServicioHasTrab;
	}

	public ServicioHasTrabajador getServicioHasTrab(int idServicio, int idUser){

		//connectionDB();
			
		
		ServicioHasTrabajador ServicioHasTrab = null; 
		Session s = session.getCurrentSession();
		
		Transaction trans=s.beginTransaction();
		
		
		Query query= s.createQuery("FROM ServicioHasTrabajador S WHERE S.servicioIdServicio = :idServicio and "
				+ "S.trabajadorUserDniuser = :idUser");
		query.setParameter("servicioIdServicio", idServicio);
		query.setParameter("trabajadorUserDniuser", idUser);
	
		
		trans.commit();
				
		List lServicioHasTra = query.list();
		Iterator listIterator = lServicioHasTra.iterator();
		
        while(listIterator.hasNext())
        {
        	ServicioHasTrabajador ServicioHasTrabTemp = (ServicioHasTrabajador) listIterator.next();
        	ServicioHasTrab = ServicioHasTrabTemp;
        }

		
		/*
		ResultSet result = queryDB("select * from user where DNIUser ="+ dni);
		User user; 
		if(result == null){
			user = null;
		}
		else{
			try {
				user = new User(result.getInt("DNIUser"), result.getString("ContraseñaUser"), 
						result.getString("NombreUser"), result.getString("ApellidoUser"), result.getString("CorreoUser"), result.getInt("Ubigeo_idUbigeo1"),
						result.getString("TelefonoUser"), result.getString("DireccionUser"), result.getInt("Trabajador"));
			} catch (SQLException e) {
				e.printStackTrace();
				user = null;
			}
		}

		disconnectionDB();
		*/
		return ServicioHasTrab;
	}

	public void addServicioHasTrab(ServicioHasTrabajador ServicioHasTrab){
		

		//connectionDB();

		Session s = session.getCurrentSession();
		
		Transaction trans=s.beginTransaction();
		s.save(ServicioHasTrab);

		trans.commit();
		
		/*
		int result = queryUpdateDB("insert into user values('"+user.getDni()+"','"+user.getPassword()+"','"+user.getName()+"','"
				+user.getLasname()+"','"+user.getEmail()+"','"+user.getUbige()+"',"+null+","+null+",'0')");

		System.out.println("salida: insert into user values('"+user.getDni()+"','"+user.getPassword()+"','"+user.getName()+"','"
				+user.getLasname()+"','"+user.getEmail()+"','"+user.getUbige()+"',"+null+","+null+",'0')");
	
		disconnectionDB();
		*/
		//return result;
	}
}
