package kachuelitos.struts;

import java.util.Map;

import kachuelitos.model.User;
import kachuelitos.model.UserDAO;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport implements SessionAware  {
	
	private int idni;
	private String spassword;
	private  Map<String, Object> session;
	private User user;
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public String validateUser() {

		System.out.println("salida" + idni +"-" +spassword);
		
		UserDAO userdao = new UserDAO();
		user = userdao.identificationUser(idni, spassword);

		if(user != null){
			
			//Se guarda la session
			session.put("user", user);
			return SUCCESS;
			
		}
		else{
			return ERROR;
		}	
	}



	public int getIdni() {
		return idni;
	}

	public void setIdni(int idni) {
		this.idni = idni;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
