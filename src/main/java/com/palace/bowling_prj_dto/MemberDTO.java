package com.palace.bowling_prj_dto;

public class MemberDTO {
	String userId;
	String userPw;
	
	public MemberDTO(String userId,String userPw) {
		// TODO Auto-generated constructor stub
		this.userId=userId;
		this.userPw=userPw;
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
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
	
}
