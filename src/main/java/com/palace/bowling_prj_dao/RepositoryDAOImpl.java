package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.palace.bowling_prj_dto.RepositoryDto;

@Repository("rDao")
public class RepositoryDAOImpl implements RepositoryDAO{
	
	@Autowired
	SqlSession sql;
	
	@Override
	public ArrayList<RepositoryDto> indexView() throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.indexView();
	}
}
