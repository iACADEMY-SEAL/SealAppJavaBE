package org.seal.model;

import java.sql.Date;
import java.util.Map;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("users")
public class User {
	
	@Id
	private String username;
	
	private String password;
	private String emailAddress;
	private String sealNumber; // seal member number
	private String studentNumber; // iAC id number
	
	private Date birthdate;
	private Date dateJoined;
	
	private boolean gender;
	
	private int memberType; // member = 0, district leader = 1, ascended = 2, admin = 3, banned = 69
	private int house; // 1 = Aurorum, 2 = Yggdrasil, 3 Emperius
	
	private int points;
	
	private Achievement[] achievements;
	private Map<String, Title> titles;
	private String activeTitle;
	
	private long[] questList;
	private long[] eventList;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getSealNumber() {
		return sealNumber;
	}
	public void setSealNumber(String sealNumber) {
		this.sealNumber = sealNumber;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Date getDateJoined() {
		return dateJoined;
	}
	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getMemberType() {
		return memberType;
	}
	public void setMemberType(int memberType) {
		this.memberType = memberType;
	}
	public int getHouse() {
		return house;
	}
	public void setHouse(int house) {
		this.house = house;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Achievement[] getAchievements() {
		return achievements;
	}
	public void setAchievements(Achievement[] achievements) {
		this.achievements = achievements;
	}
	public Map<String, Title> getTitles() {
		return titles;
	}
	public void setTitles(Map<String, Title> titles) {
		this.titles = titles;
	}
	public String getActiveTitle() {
		return activeTitle;
	}
	public void setActiveTitle(String activeTitle) {
		this.activeTitle = activeTitle;
	}
	public long[] getQuestList() {
		return questList;
	}
	public void setQuestList(long[] questList) {
		this.questList = questList;
	}
	public long[] getEventList() {
		return eventList;
	}
	public void setEventList(long[] eventList) {
		this.eventList = eventList;
	}
	
}
