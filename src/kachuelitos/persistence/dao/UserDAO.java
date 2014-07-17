package kachuelitos.persistence.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO extends Database {

	public UserDAO() {

	}

	public ArrayList<User> getAllUser(){

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
		return alUser;
	}

	public User getUser(int dni){

		connectionDB();
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
		return user;

	}

	public int addUser(User user){
		connectionDB();

		int result = queryUpdateDB("insert into user values('"+user.getDni()+"','"+user.getPassword()+"','"+user.getName()+"','"
				+user.getLasname()+"','"+user.getEmail()+"','"+user.getUbige()+"',"+null+","+null+",'0')");

		System.out.println("salida: insert into user values('"+user.getDni()+"','"+user.getPassword()+"','"+user.getName()+"','"
				+user.getLasname()+"','"+user.getEmail()+"','"+user.getUbige()+"',"+null+","+null+",'0')");
	
		disconnectionDB();
		return result;
	}

	public User identificationUser(int dni, String password){

		connectionDB();

	//	System.out.println("select * from user where DNIUser ="+ dni+" and ContrasenhaUser ="+password);
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
		return user;
	}

}
