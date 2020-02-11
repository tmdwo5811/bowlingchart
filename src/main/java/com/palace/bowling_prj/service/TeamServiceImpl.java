package com.palace.bowling_prj.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.palace.bowling_prj_dao.TeamDAOImpl;
import com.palace.bowling_prj_dto.RepositoryDTO;

@Service("teamService")
@Configuration("teamService")
public class TeamServiceImpl implements TeamService{
	
	@Autowired
	TeamDAOImpl dao;
	
	@Override
	public ArrayList<RepositoryDTO> teamListDao(int userNo) {
		// TODO Auto-generated method stub
		return dao.teamListDao(userNo);
	}
	@Override
	public void makeTeam(String teamName, int userNo) {
		// TODO Auto-generated method stub
		dao.makeTeam(teamName, userNo);
	}
	@Override
	public void deleteTeam(int teamNo) {
		// TODO Auto-generated method stub
		dao.deleteTeam(teamNo);
	}
}
