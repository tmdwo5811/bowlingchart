package com.palace.bowling_prj_dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RepositoryDto {
	
	int userNo;
	String userName;
	String phone;
	String teamName;
	int teamNo;
	String mFsize;
	String rFsize;
	String reg_date;
	
	public RepositoryDto() {
		// TODO Auto-generated constructor stub
	}
	public RepositoryDto(int userNo, String userName, String phone, String teamName,int teamNo, String mFsize, String rFsize, Timestamp reg_date) {
		// TODO Auto-generated constructor stub
		this.userNo = userNo;
		this.userName = userName;
		this.phone = phone;
		this.teamName = teamName;
		this.teamNo = teamNo;
		this.mFsize = mFsize;
		this.rFsize = rFsize;
		this.reg_date = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(reg_date);
	}
	public int getUserNo() {
		return userNo;
	}
	public String getUserName() {
		return userName;
	}
	public String getPhone() {
		return phone;
	}
	public String getTeamName() {
		return teamName;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public String getmFsize() {
		return mFsize;
	}
	public String getrFsize() {
		return rFsize;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public void setmFsize(String mFsize) {
		this.mFsize = mFsize;
	}
	public void setrFsize(String rFsize) {
		this.rFsize = rFsize;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(reg_date);
	}
	
	
}
