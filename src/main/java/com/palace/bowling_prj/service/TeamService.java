package com.palace.bowling_prj.service;

import java.util.ArrayList;

import com.palace.bowling_prj_dto.RepositoryDto;

public interface TeamService {

	public ArrayList<RepositoryDto> teamListDao();
	public void makeTeam(String teamName);

	public void deleteTeam(int teamNo);
	/*public RepositoryDto makeTeamDao();
	*/
}
