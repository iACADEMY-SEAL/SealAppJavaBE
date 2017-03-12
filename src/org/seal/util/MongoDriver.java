package org.seal.util;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;

public class MongoDriver {
	
	public static String DB_NAME = "sealappdb";
	private static MongoClient mongoClient;
	
	private static final Morphia morphia = new Morphia();
	private static Datastore ds;
	
	
	public static Datastore getConnection() {
		if (ds != null) {
			return ds;
		}
		else {
			mongoClient = new MongoClient();
			
			mapPackages();
			
			ds = morphia.createDatastore(mongoClient, DB_NAME);		
			return ds;
		}	
	}
	
	private static void mapPackages() {
		
		morphia.mapPackage("org.seal.model");
		
	}

}