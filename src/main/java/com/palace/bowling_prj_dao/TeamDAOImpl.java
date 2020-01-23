package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.palace.bowling_prj_dto.RepositoryDto;


@Repository("tDao")
public class TeamDAOImpl implements TeamDAO{
	
	@Autowired
	SqlSession sql;
	
	@Override
	public ArrayList<RepositoryDto> teamListDao() {
		// TODO Auto-generated method stub
		TeamDAO idao = sql.getMapper(TeamDAO.class);
		return idao.teamListDao();
	}
	
}
