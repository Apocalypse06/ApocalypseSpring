package com.Apocalypse.point.bean;

import java.sql.Timestamp;

public class Topup {

	private int id;
	private String member_Id;
	private String transationType;
	private int cash;
	private int newPoints;
	private String token;
	private Timestamp time;
	public Topup() {
		super();
	}
	public Topup(int id, String member_Id, String transationType, int cash, int newPoints, String token) {
		
		this.id = id;
		this.member_Id = member_Id;
		this.transationType = transationType;
		this.cash = cash;
		this.newPoints = newPoints;
		this.token = token;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMember_Id() {
		return member_Id;
	}
	public void setMember_Id(String member_Id) {
		this.member_Id = member_Id;
	}
	public String getTransationType() {
		return transationType;
	}
	public void setTransationType(String transationType) {
		this.transationType = transationType;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getnewPoints() {
		return newPoints;
	}
	public void setnewPoints(int newPoints) {
		this.newPoints = newPoints;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
