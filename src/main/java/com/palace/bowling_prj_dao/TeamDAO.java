package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import com.palace.bowling_prj_dto.RepositoryDto;

public interface TeamDAO {
	public ArrayList<RepositoryDto> teamListDao();
	public RepositoryDto makeTeamDao();
	public void deleteTeam(int teamNo);
	public void makeTeam(String teamName);
}
