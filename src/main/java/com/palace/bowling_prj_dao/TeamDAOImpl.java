package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.palace.bowling_prj_dto.RepositoryDto;



@Repository("tDao")
@Configuration("tDao")
public class TeamDAOImpl implements TeamDAO{
	
	@Autowired
	SqlSession sql;
	
	@Override
	public ArrayList<RepositoryDto> teamListDao() {
		// TODO Auto-generated method stub
		TeamDAO idao = sql.getMapper(TeamDAO.class);
		return idao.teamListDao();
	}
	@Override
	public void makeTeam(String teamName) {
		// TODO Auto-generated method stub
		TeamDAO idao = sql.getMapper(TeamDAO.class);
		idao.makeTeam(teamName);
	}
	@Override
	public void deleteTeam(int teamNo) {
		// TODO Auto-generated method stub
		TeamDAO idao = sql.getMapper(TeamDAO.class);
		idao.deleteTeam(teamNo);
	}
	
}
