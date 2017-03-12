package org.seal.controller;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.seal.model.ResponseEntity;
import org.seal.model.User;
import org.seal.util.MongoDriver;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity query() {
		
		Datastore ds = MongoDriver.getConnection();
		
		Query<User> query = ds.createQuery(User.class);
		List<User> users = query.asList();
		
		for (User u : users) {
			System.out.println(u.getUsername());
		}
		
		ResponseEntity response = new ResponseEntity(users, 200, "Success!");
				
		return response;
	}
	
	// registration
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ResponseEntity create(@RequestBody User user) {

		Datastore ds = MongoDriver.getConnection();
		// we need validation
		
		user.setDateJoined(new Date(Calendar.getInstance().getTime().getTime()));
		
		ds.save(user);
		
		ResponseEntity response;
		
		response = new ResponseEntity(null, 200, "Successful Creation");
		return response;
	}
	
}
