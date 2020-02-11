package com.palace.bowling_prj.service;

import java.util.ArrayList;

import com.palace.bowling_prj_dto.RepositoryDTO;

public interface TeamService {

	public ArrayList<RepositoryDTO> teamListDao(int userNo);
	public void makeTeam(String teamName, int userNo);

	public void deleteTeam(int teamNo);
	/*public RepositoryDto makeTeamDao();
	*/
}
