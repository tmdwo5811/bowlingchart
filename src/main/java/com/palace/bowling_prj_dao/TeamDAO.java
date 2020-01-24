package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import com.palace.bowling_prj_dto.RepositoryDTO;

public interface TeamDAO {
	public ArrayList<RepositoryDTO> teamListDao();
	public void makeTeam(String teamName);
	public void deleteTeam(int teamNo);
	/*public RepositoryDto makeTeamDao();
	*/
}
