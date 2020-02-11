package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.palace.bowling_prj_dto.RepositoryDTO;



@Repository("tDao")
@Configuration("tDao")
public class TeamDAOImpl implements TeamDAO{

	@Autowired	
	private SqlSession sql;

	
	@Override
	public ArrayList<RepositoryDTO> teamListDao(int userNo) {
		// TODO Auto-generated method stub
		TeamDAO idao = sql.getMapper(TeamDAO.class);
		return idao.teamListDao(userNo);
	}
	@Override
	public void makeTeam(String teamName, int userNo) {
		// TODO Auto-generated method stub
		TeamDAO idao = sql.getMapper(TeamDAO.class);
		System.out.println(teamName+"생성 팀명");
		idao.makeTeam(teamName, userNo);
	}
	@Override
	public void deleteTeam(int teamNo) {
		// TODO Auto-generated method stub
		TeamDAO idao = sql.getMapper(TeamDAO.class);
		idao.deleteTeam(teamNo);
	}
	
}
