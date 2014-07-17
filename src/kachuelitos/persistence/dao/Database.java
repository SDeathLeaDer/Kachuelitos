package kachuelitos.persistence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kachuelitos.jsf.UserBean;

public class Database {

	private Statement statement;
	private Connection connection;
	private ResultSet result;
	private String url = "jdbc:mysql://localhost:3306/";
	private String dbName = "mydb";
	private String driver = "com.mysql.jdbc.Driver";
	private String userName = "root";
	private String password = "koba";

	public void connectionDB(){
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(url+dbName,userName,password);    
	
			
		} 
		catch (SQLException s){
			s.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public void disconnectionDB(){
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet queryDB(String sql){
		try {
			statement = connection.createStatement();
			System.out.println("salida: "+ sql);
			result = statement.executeQuery(sql);

		} catch (SQLException e) {
			e.printStackTrace();
			result = null;
		}

		return result;
	}

	public int queryUpdateDB(String sql){
		int result;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			result = 0;
		} catch (SQLException e) {
			e.printStackTrace();
			result = 1;
		}

		return result;
	}
}