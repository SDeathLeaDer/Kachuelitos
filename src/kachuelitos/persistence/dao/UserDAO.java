package kachuelitos.persistence.dao;

import java.util.Iterator;
import java.util.List;

import kachuelitos.persistence.entity.SessionFactoryUtil;
import kachuelitos.persistence.entity.User;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UserDAO extends Database {

	private SessionFactory session;

	public UserDAO() {			
		session = SessionFactoryUtil.getInstance();
	}

	public List<User> getAllUser(){

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
		List<User> listUsuario = (List<User>)s.createQuery("from User").list();
	
		trans.commit();

		return listUsuario;
	}

	public User getUser(int dni){

		//connectionDB();
			
		Session s = session.getCurrentSession();
		
		Transaction trans=s.beginTransaction();
		User user = (User)s.get(User.class, dni);

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
		return user;
		

	}

	public void addUser(User user){
		

		//connectionDB();

		Session s = session.getCurrentSession();
		
		Transaction trans=s.beginTransaction();
		s.save(user);

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

	public User identificationUser(int dni, String password){

		User user = null; 
		Session s = session.getCurrentSession();
		
		Transaction trans=s.beginTransaction();
		
		Query query= s.createQuery("FROM User U WHERE U.dniuser = :dni and U.contrasenhaUser = :password");
		query.setParameter("dni", dni);
		query.setParameter("password", password);

		List lUser = query.list();
		Iterator listIterator = lUser.iterator();
		
        while(listIterator.hasNext())
        {
            User usertemp = (User) listIterator.next();
            user = usertemp;
        }

		trans.commit();

		//connectionDB();
		
	//	System.out.println("select * from user where DNIUser ="+ dni+" and ContrasenhaUser ="+password);
		
		/*
		ResultSet result = queryDB("select * from user where DNIUser = '"+ dni+"' and ContrasenhaUser = '"+password+"'");
		User user = null; 

		if(result == null){
			user = null;
		}
		else{
			try {
				while (result.next()) {
					System.out.println(result.getString("ContrasenhaUser"));
					user = new User(result.getInt("DNIUser"), result.getString("ContrasenhaUser"), 
							result.getString("NombreUser"),result.getString("ApellidoUser"), result.getString("CorreoUser"), result.getInt("Ubigeo_idUbigeo1"),
							result.getString("TelefonoUser"), result.getString("DireccionUser"), result.getInt("Trabajador"));
				}

			} catch (SQLException e) {
				e.printStackTrace();
				user = null;
			}
		}

		disconnectionDB();
		*/
		
		
		
		return user;
	}
}
