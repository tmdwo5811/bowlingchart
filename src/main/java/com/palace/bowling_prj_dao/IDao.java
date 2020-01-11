package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.palace.bowling_prj_dto.MemberDto;
import com.palace.bowling_prj_dto.RepositoryDto;

public interface IDao {
	public MemberDto loginDao();
	public ArrayList<RepositoryDto> indexView();
	public ArrayList<RepositoryDto> teamListDao();
	public RepositoryDto modifyMemberSize(int userNo);
	public RepositoryDto makeTeamDao();
	public RepositoryDto sizeView(int userNo);
	public void deleteTeam(int teamNo);
	public void makeTeam(String teamName);
	public void sizeWrite(@Param("Val1") int team_teamno,@Param("Val2") String username,@Param("Val3") String tPhone,@Param("Val4") String rfsize,@Param("Val5") String mfsize);
	public void deleteMemberSize(int userNo);
	public void modifyMemberSizeSave(int tNo, String tName, String tPhone, String tRsize, String tMsize);
}
