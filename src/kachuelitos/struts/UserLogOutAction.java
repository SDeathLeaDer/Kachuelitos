package kachuelitos.struts;

import java.util.Map;

import kachuelitos.model.User;
import kachuelitos.model.UserDAO;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserLogOutAction extends ActionSupport  {
	
	private User user;
		
	public String logoutUser() {


		//Se guarda la session
		//getSession().
		//session.put("user", user);
		return SUCCESS;
			

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
