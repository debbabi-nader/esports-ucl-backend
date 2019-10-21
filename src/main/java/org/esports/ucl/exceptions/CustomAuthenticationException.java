package org.esports.ucl.exceptions;

import org.springframework.security.core.AuthenticationException;


public class CustomAuthenticationException extends AuthenticationException {

	private static final long serialVersionUID = -1327724362816300406L;

	public CustomAuthenticationException() {
		super("");
	}
	
	public CustomAuthenticationException(String msg) {
		super(msg);
	}
	
	public CustomAuthenticationException(String msg, Throwable t) {
		super(msg, t);
	}
	
}
