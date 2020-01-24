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
	public void sizeWrite(int tNo, String tName, String tPhone, String tRsize, String tMsize) throws Exception {
		// TODO Auto-generated method stub
		dao.sizeWrite(tNo,tName,tPhone,tRsize,tMsize);
	}
	@Override
	public void deleteMemberSize(int userNo) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteMemberSize(userNo);
	}
	@Override
	public RepositoryDto sizeView(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.sizeView(userNo);
	}
	@Override
	public RepositoryDto modifyMemberSize(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.modifyMemberSize(userNo);
	}
	@Override
	public void modifyMemberSizeSave(int tNo, String tName, String tPhone, String tRsize, String tMsize, int userNo) throws Exception {
		// TODO Auto-generated method stub
		dao.modifyMemberSizeSave(tNo, tName, tPhone, tRsize, tMsize, userNo);
	}
}
