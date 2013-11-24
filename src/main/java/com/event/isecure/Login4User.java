package com.event.isecure;

import java.io.Serializable;
import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

public class Login4User implements LoginModule, Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = (long) (Math.random()*1l);
	private String password;
    private String username;
    private Subject subject;

	public Login4User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize(Subject subject, CallbackHandler callbackHandler,
			Map<String, ?> sharedState, Map<String, ?> options) {
		// TODO Auto-generated method stub
	    
	        this.subject = subject;
	 
	        try {
	            NameCallback nameCallback = new NameCallback("prompt");
	            PasswordCallback passwordCallback = new PasswordCallback("prompt",
	                    false);
	 
	            callbackHandler.handle(new Callback[] { nameCallback,
	                    passwordCallback });
	 
	            password = new String(passwordCallback.getPassword());
	            username = nameCallback.getName();
	 
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }

	}

	@Override
	public boolean login() throws LoginException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean commit() throws LoginException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean abort() throws LoginException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout() throws LoginException {
		// TODO Auto-generated method stub
		return false;
	}

}
