package app.secure.isecure;

import java.io.Serializable;
import java.security.Principal;
import java.sql.Date;

public final class UserPrincipal implements Principal,Serializable {
	private String name;
	private String role;
	private Date loginTime;
	
	
	public UserPrincipal(String name) {
		super();
		this.name = name;
	}


	public UserPrincipal(String name, String role, Date loginTime) {
		super();
		this.name = name;
		this.role = role;
		this.loginTime = loginTime;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
