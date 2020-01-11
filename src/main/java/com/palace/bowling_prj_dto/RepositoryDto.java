package com.palace.bowling_prj_dto;

public class RepositoryDto {
	
	int userNo;
	String userName;
	int phone;
	String teamName;
	int teamNo;
	String bMsize;
	String bRsize;

	public RepositoryDto() {
		// TODO Auto-generated constructor stub
	}
	public RepositoryDto(int userNo, String userName, int phone, String teamName,int teamNo, String bMsize, String bRsize) {
		// TODO Auto-generated constructor stub
		this.userNo = userNo;
		this.userName = userName;
		this.phone = phone;
		this.teamName = teamName;
		this.teamNo = teamNo;
		this.bMsize = bMsize;
		this.bRsize = bRsize;
	}
	
	
	public int getuserNo() {
		return userNo;
	}
	public void setuserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getuserName() {
		return userName;
	}

	public int getphone() {
		return phone;
	}

	public String getbMsize() {
		return bMsize;
	}

	public String getbRsize() {
		return bRsize;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public void setphone(int phone) {
		this.phone = phone;
	}

	public void setbMsize(String bMsize) {
		this.bMsize = bMsize;
	}

	public void setbRsize(String bRsize) {
		this.bRsize = bRsize;
	}

}
