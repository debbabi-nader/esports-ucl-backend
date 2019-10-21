package org.esports.ucl.services;

import org.esports.ucl.entities.UserEntity;


public interface UserService {

	public UserEntity findUserByEmail(String email);
	
	public UserEntity getAuthenticatedUser();
	
}
