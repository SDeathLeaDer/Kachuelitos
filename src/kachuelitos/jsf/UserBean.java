package kachuelitos.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import kachuelitos.model.User;
//import kachuelitos.jsf.PersonaDAO;
import kachuelitos.model.UserDAO;

@ManagedBean 
@RequestScoped 
public class UserBean implements Serializable { /** * */
	
	private static final long serialVersionUID = 1L;	
	private int dni;
	private String password;
	private User objUser;
	private String fullname;
	
		
	public String validar() throws Exception{
		
		return null;
	}
		
	public int getDni(){
		return dni;
	}
	
	public void setDni(int dni){
		this.dni = dni;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	public void setObjUser(User objUser) {
		this.objUser = objUser;
		
		
	}
	
	public User getObjUser() {
		return objUser;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	
	
}