package com.palace.bowling_prj.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.palace.bowling_prj_dao.RepositoryDAOImpl;
import com.palace.bowling_prj_dto.RepositoryDto;

@Service("repositoryService")
@Configuration("repositoryService")
public class RepositoryServiceImpl implements RepositoryService{
	
	@Autowired
	RepositoryDAOImpl dao;
	
	@Override
	public ArrayList<RepositoryDto> indexView() throws Exception {
		// TODO Auto-generated method stub
		return dao.indexView();
	}
	@Override
	public void sizeWrite(RepositoryDto vo) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
