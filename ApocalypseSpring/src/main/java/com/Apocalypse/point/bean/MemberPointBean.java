package com.Apocalypse.point.bean;

public class MemberPointBean {

	private int id;
	private String member_Id;
	private int points;
	public MemberPointBean() {
		super();
	}
	public MemberPointBean(int id, String member_Id, int points) {
		this.id = id;
		this.member_Id = member_Id;
		this.points = points;
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
	public int getpoints() {
		return points;
	}
	public void setpoints(int points) {
		this.points = points;
	}
}
