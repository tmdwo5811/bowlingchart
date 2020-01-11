package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import com.palace.bowling_prj_dto.MemberDto;
import com.palace.bowling_prj_dto.RepositoryDto;

public interface IDao {
	public MemberDto loginDao();
	public ArrayList<RepositoryDto> indexView();
	public RepositoryDto makeTeamDao();
	public ArrayList<RepositoryDto> teamListDao();
	public void deleteTeam(int teamNo);
	public void makeTeam(String teamName);
	public void sizeWrite(int team_teamno, String username, int phone, String rfsize, String mfsize);
	public RepositoryDto sizeView(int userNo);
}
