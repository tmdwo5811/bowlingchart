package com.palace.bowling_prj_dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserDTO {
	
	@NotEmpty
	@Length(min=3,max=20)
	String userId;
	
	@NotEmpty
	@Length(min=3,max=30)
	String userPw;
	
	@NotEmpty
	@Email
	String userEmail;
	
	@NotEmpty
	String userName;
	int userNo;

	public UserDTO(String userId, String userPw, String userEmail, String userName, int userNo) {
		// TODO Auto-generated constructor stub
		this.userId = userId;
		this.userPw = userPw;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userNo = userNo;
	}

	public UserDTO() {
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

	public String getUserName() {
		return userName;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int UserNo) {
		this.userNo = UserNo;
	}

	public void setUserName(String UserName) {
		this.userName = UserName;
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
