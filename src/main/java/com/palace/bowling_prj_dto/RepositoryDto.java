package com.palace.bowling_prj_dto;

public class RepositoryDto {
	
	String bName;
	int bPhone;
	String teamName;
	int teamNo;
	String bMsize;
	String bRsize;

	public RepositoryDto() {
		// TODO Auto-generated constructor stub
	}
	public RepositoryDto(String bName, int bPhone, String teamName,int teamNo, String bMsize, String bRsize) {
		// TODO Auto-generated constructor stub
		this.bName = bName;
		this.bPhone = bPhone;
		this.teamName = teamName;
		this.teamNo = teamNo;
		this.bMsize = bMsize;
		this.bRsize = bRsize;
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

	public String getbName() {
		return bName;
	}

	public int getbPhone() {
		return bPhone;
	}

	public String getbMsize() {
		return bMsize;
	}

	public String getbRsize() {
		return bRsize;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public void setbPhone(int bPhone) {
		this.bPhone = bPhone;
	}

	public void setbMsize(String bMsize) {
		this.bMsize = bMsize;
	}

	public void setbRsize(String bRsize) {
		this.bRsize = bRsize;
	}

}
