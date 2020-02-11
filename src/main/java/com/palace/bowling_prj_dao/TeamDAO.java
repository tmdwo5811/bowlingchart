package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.palace.bowling_prj_dto.RepositoryDTO;

public interface TeamDAO {
	public ArrayList<RepositoryDTO> teamListDao(int userNo);
	public void makeTeam(@Param("teamName") String teamName, @Param("userNo") int userNo);
	public void deleteTeam(@Param("teamNo")int teamNo);
	/*public RepositoryDto makeTeamDao();
	*/
}
