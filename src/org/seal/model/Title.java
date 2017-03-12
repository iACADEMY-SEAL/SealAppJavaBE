package org.seal.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("titles")
public class Title {
	
	@Id
	private ObjectId id;
	
	private String titleName;
	
	private Effect[] effects;

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public Effect[] getEffects() {
		return effects;
	}

	public void setEffects(Effect[] effects) {
		this.effects = effects;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}
	
	
}
