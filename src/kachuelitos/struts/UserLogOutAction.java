package kachuelitos.struts;

import java.util.Map;

import kachuelitos.persistence.entity.User;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class UserLogOutAction extends ActionSupport implements SessionAware  {
	
	private  Map<String, Object> session;
		
	public String logoutUser() {

		
		if(session.containsKey("user")){	
			session.remove("user");
			return SUCCESS;
		}
		else{
			return ERROR;
		}

	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}
}
