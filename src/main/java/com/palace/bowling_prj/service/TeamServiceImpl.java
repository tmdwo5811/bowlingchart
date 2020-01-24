package com.palace.bowling_prj.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.palace.bowling_prj_dao.TeamDAOImpl;
import com.palace.bowling_prj_dto.RepositoryDto;

@Service("teamService")
@Configuration("teamService")
public class TeamServiceImpl implements TeamService{
	
	@Autowired
	TeamDAOImpl dao;
	
	@Override
	public ArrayList<RepositoryDto> teamListDao() {
		// TODO Auto-generated method stub
		return dao.teamListDao();
	}
	@Override
	public void makeTeam(String teamName) {
		// TODO Auto-generated method stub
		dao.makeTeam(teamName);
	}
	@Override
	public void deleteTeam(int teamNo) {
		// TODO Auto-generated method stub
		dao.deleteTeam(teamNo);
	}
}
