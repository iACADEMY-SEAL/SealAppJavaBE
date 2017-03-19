package org.seal.util;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.seal.model.User;

/**
 * @author Jason Jover
 * This class will be used for password handling and management.
 * This class will also be used for any changes needed to be done on the user on code run.
 *
 */
public class UserManager {
	
	private Datastore ds;
	
	public UserManager() {
		ds = MongoDriver.getConnection();
//		not sure if will need a singleton or if this is okay.
	}
	
	/**
	 * This method is used to clear passwords after auth (like logins).
	 * I don't like the idea that when user data is returned, exposed din si password. Even hashed ones.
	 */
	private User clearPassword(User user) {
		user.setPassword(null);
		
		return user;
	}
	
	public User login(String user, String pass) {
		
		Query<User> query = ds.createQuery(User.class);
		User retrieved = query.filter("username ==", user).get();
				
		return null;
	}
	
	
}
