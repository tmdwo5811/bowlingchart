package com.palace.bowling_prj_dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class RepositoryDTO {
	
	int userNo;
	int memberNo;
	String memberName;
	String memberPhone;
	String teamName;
	int teamNo;
	int team_teamNo;
	String reg_date;
	String middleFingerReverse;
	String ringFingerReverse;
	String middleFingerLeft;
	String ringFingerRight;
	String insert1;
	String insert2;
	String middleFingerForward;
	String ringFingerForward;
	String span1;
	String span2;
	String thumbForward;
	String tumbLeft;
	String thumb;
	String thumbRight;
	String thumbReverse;
	String no1;
	String no2;
	String no3;
	
	
	public RepositoryDTO() {
		// TODO Auto-generated constructor stub
	}
	public RepositoryDTO(	
							int userNo,
							int memberNo,
							String memberName,
							String memberPhone,
							String teamName,
							int teamNo,
							int team_teamNo,
							Timestamp reg_date,
							String middleFingerReverse,
							String ringFingerReverse,
							String middleFingerLeft,
							String ringFingerRight,
							String insert1,
							String insert2, 
							String middleFingerForward,
							String ringFingerForward,
							String span1,
							String span2,
							String thumbForward,
							String tumbLeft,
							String thumb,
							String thumbRight,
							String thumbReverse,
							String no1,
							String no2,
							String no3
							){
		// TODO Auto-generated constructor stub
		this.userNo = userNo;
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.teamName = teamName;
		this.teamNo = teamNo;
		this.team_teamNo = team_teamNo;
		this.reg_date = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(reg_date);
		this.middleFingerReverse = middleFingerReverse;
		this.ringFingerReverse = ringFingerReverse;
		this.middleFingerLeft = middleFingerLeft;
		this.ringFingerRight = ringFingerRight;
		this.insert1 = insert1;
		this.insert2 = insert2;
		this.middleFingerForward = middleFingerForward;
		this.ringFingerForward = ringFingerForward;
		this.span1 = span1;
		this.span2 = span2;
		this.thumbForward = thumbForward;
		this.tumbLeft = tumbLeft;
		this.thumb = thumb;
		this.thumbRight = thumbRight;
		this.thumbReverse = thumbReverse;
		this.no1 = no1;
		this.no2 = no2;
		this.no3 = no3;
	}
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getTeam_teamNo() {
		return team_teamNo;
	}
	public void setTeam_teamNo(int team_teamNo) {
		this.team_teamNo = team_teamNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public String getTeamName() {
		return teamName;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public String getReg_date() {
		return reg_date;
	}
	
	public String getMiddleFingerReverse() {
		return middleFingerReverse;
	}
	public void setMiddleFingerReverse(String middleFingerReverse) {
		this.middleFingerReverse = middleFingerReverse;
	}
	public String getRingFingerReverse() {
		return ringFingerReverse;
	}
	public void setRingFingerReverse(String ringFingerReverse) {
		this.ringFingerReverse = ringFingerReverse;
	}
	public String getMiddleFingerLeft() {
		return middleFingerLeft;
	}
	public void setMiddleFingerLeft(String middleFingerLeft) {
		this.middleFingerLeft = middleFingerLeft;
	}
	public String getRingFingerRight() {
		return ringFingerRight;
	}
	public void setRingFingerRight(String ringFingerRight) {
		this.ringFingerRight = ringFingerRight;
	}
	public String getInsert1() {
		return insert1;
	}
	public void setInsert1(String insert1) {
		this.insert1 = insert1;
	}
	public String getInsert2() {
		return insert2;
	}
	public void setInsert2(String insert2) {
		this.insert2 = insert2;
	}
	public String getMiddleFingerForward() {
		return middleFingerForward;
	}
	public void setMiddleFingerForward(String middleFingerForward) {
		this.middleFingerForward = middleFingerForward;
	}
	public String getRingFingerForward() {
		return ringFingerForward;
	}
	public void setRingFingerForward(String ringFingerForward) {
		this.ringFingerForward = ringFingerForward;
	}
	public String getSpan1() {
		return span1;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public void setSpan1(String span1) {
		this.span1 = span1;
	}
	public String getSpan2() {
		return span2;
	}
	public void setSpan2(String span2) {
		this.span2 = span2;
	}
	public String getThumbForward() {
		return thumbForward;
	}
	public void setThumbForward(String thumbForward) {
		this.thumbForward = thumbForward;
	}
	public String getTumbLeft() {
		return tumbLeft;
	}
	public void setTumbLeft(String tumbLeft) {
		this.tumbLeft = tumbLeft;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getThumbRight() {
		return thumbRight;
	}
	public void setThumbRight(String thumbRight) {
		this.thumbRight = thumbRight;
	}
	public String getThumbReverse() {
		return thumbReverse;
	}
	public void setThumbReverse(String thumbReverse) {
		this.thumbReverse = thumbReverse;
	}
	public String getNo1() {
		return no1;
	}
	public void setNo1(String no1) {
		this.no1 = no1;
	}
	public String getNo2() {
		return no2;
	}
	public void setNo2(String no2) {
		this.no2 = no2;
	}
	public String getNo3() {
		return no3;
	}
	public void setNo3(String no3) {
		this.no3 = no3;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(reg_date);
	}
	
}
