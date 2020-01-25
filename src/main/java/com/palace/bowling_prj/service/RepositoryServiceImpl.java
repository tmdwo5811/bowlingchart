package com.palace.bowling_prj.service;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.palace.bowling_prj.common.PageNavigator;
import com.palace.bowling_prj_dao.RepositoryDAOImpl;
import com.palace.bowling_prj_dto.RepositoryDTO;

@Service("repositoryService")
@Configuration("repositoryService")
public class RepositoryServiceImpl implements RepositoryService{
	
	@Autowired
	RepositoryDAOImpl dao;
	
	@Override
	public ArrayList<RepositoryDTO> indexView(int start, int end,String userSearch) throws Exception {
		// TODO Auto-generated method stub
		return dao.indexView(start,end,userSearch);
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
	public RepositoryDTO sizeView(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.sizeView(userNo);
	}
	@Override
	public RepositoryDTO modifyMemberSize(int userNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.modifyMemberSize(userNo);
	}
	@Override
	public void modifyMemberSizeSave(int tNo, String tName, String tPhone, String tRsize, String tMsize, int userNo) throws Exception {
		// TODO Auto-generated method stub
		dao.modifyMemberSizeSave(tNo, tName, tPhone, tRsize, tMsize, userNo);
	}
	@Override
	public int selectCount(String userSearch) {
		// TODO Auto-generated method stub
		return dao.selectCount(userSearch);
	}
	
}
