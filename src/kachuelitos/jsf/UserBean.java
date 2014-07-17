package kachuelitos.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

//import kachuelitos.jsf.PersonaDAO;
import kachuelitos.persistence.dao.User;
import kachuelitos.persistence.dao.UserDAO;

@ManagedBean 
@RequestScoped 
public class UserBean implements Serializable { /** * */
	
	private static final long serialVersionUID = 1L;	
	private int dni;
	private String password;
	private User objUser;
	private String fullname;
	
		
	public String validar() throws Exception{
		
		UserDAO useDAO = new UserDAO();
		String sResponse = null;
		
		objUser = useDAO.identificationUser(this.dni, this.password);
		fullname = objUser.getName()+ " " +objUser.getLasname();
		
		if(objUser == null){
			sResponse = "fail";
		}
		else{
			sResponse ="success";	
		}
		return sResponse;
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