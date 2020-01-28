package com.palace.bowling_prj_dto;

public class LoginDTO {
	String aId;
	String aPw;
	
	public LoginDTO(String aId, String aPw) {
		// TODO Auto-generated constructor stub
		this.aId = aId;
		this.aPw = aPw;
	}
	public LoginDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getaId() {
		return aId;
	}
	public void setaId(String aId) {
		this.aId = aId;
	}
	public String getaPw() {
		return aPw;
	}
	public void setaPw(String aPw) {
		this.aPw = aPw;
	}
	
}
