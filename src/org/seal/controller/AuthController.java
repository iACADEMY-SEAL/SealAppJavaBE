package org.seal.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.seal.model.ResponseEntity;
import org.seal.model.User;
import org.seal.util.MongoDriver;
import org.seal.util.UserManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason Jover
 * This controller is responsible for logging in, session tracking and management, and logout.
 * 
 */
@RestController
public class AuthController {

	// login
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity create(@RequestBody User user) {

		UserManager userM = new UserManager();
		
		User loggedUser = userM.login(user.getUsername(), user.getPassword());
		List<User> data = new ArrayList<User>();
		
		data.add(loggedUser);
		
		// we need validation
		
		ResponseEntity response;
		
		response = new ResponseEntity(data, 200, "Successful Creation");
		return response;
	}
	
}
