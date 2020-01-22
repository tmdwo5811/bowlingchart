package com.palace.bowling_prj.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palace.bowling_prj_dao.RepositoryDAOImpl;
import com.palace.bowling_prj_dto.RepositoryDto;

@Service("repositoryService")
public class RepositoryServiceImpl implements RepositoryService{
	
	@Autowired
	RepositoryDAOImpl dao;
	
	@Override
	public ArrayList<RepositoryDto> indexView() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service indexView 실행");
		return dao.indexView();
	}
	
}
