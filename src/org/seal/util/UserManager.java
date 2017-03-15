package org.seal.util;

import org.seal.model.User;

/**
 * @author Jason Jover
 * This class will be used for password handling and management.
 * This class will also be used for any changes needed to be done on the user on code run.
 *
 */
public class UserManager { 
	
	/**
	 * This method is used to clear passwords after auth (like logins).
	 * I don't like the idea that when user data is returned, exposed din si password. Even hashed ones.
	 */
	private User clearPassword(User user) {
		user.setPassword(null);
		
		return user;
	}
	
	
}
