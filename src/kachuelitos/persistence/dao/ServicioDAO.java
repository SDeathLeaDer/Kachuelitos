package kachuelitos.persistence.dao;

import java.util.Iterator;
import java.util.List;

import kachuelitos.persistence.entity.SessionFactoryUtil;
import kachuelitos.persistence.entity.Servicio;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ServicioDAO {

	private SessionFactory session;

	public ServicioDAO() {			
		session = SessionFactoryUtil.getInstance();
	}

	
	public List<Servicio> getAllService(){

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
		List<Servicio> listService = (List<Servicio>)s.createQuery("from Servicio").list();
	
		trans.commit();

		return listService;
	}

	public Servicio getService(int idService){

		//connectionDB();
			
		Session s = session.getCurrentSession();
		
		Transaction trans=s.beginTransaction();
		Servicio service = (Servicio)s.get(Servicio.class, idService);

		trans.commit();
		
		
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
		return service;
	}

	public void addService(Servicio service){
		

		//connectionDB();

		Session s = session.getCurrentSession();
		
		Transaction trans=s.beginTransaction();
		s.save(service);

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
