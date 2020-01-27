package com.palace.bowling_prj_dto;

public class MemberDTO {
	String userId;
	String userPw;
	String userEmail;
	
	public MemberDTO(String userId,String userPw, String userEmail) {
		// TODO Auto-generated constructor stub
		this.userId=userId;
		this.userPw=userPw;
		this.userEmail=userEmail;
	}
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	
}
