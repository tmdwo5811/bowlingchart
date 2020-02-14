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
	public ArrayList<RepositoryDTO> indexView(int start, int end,String userSearch, int userNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.indexView(start,end,userSearch,userNo);
	}
	@Override
	public void sizeWrite(RepositoryDTO rDto) throws Exception {
		// TODO Auto-generated method stub
		dao.sizeWrite(rDto);
	}
	@Override
	public void deleteMemberSize(int memberNo) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteMemberSize(memberNo);
	}
	@Override
	public RepositoryDTO sizeView(int memberNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.sizeView(memberNo);
	}
	@Override
	public RepositoryDTO modifyMemberSize(int memberNo) throws Exception {
		// TODO Auto-generated method stub
		return dao.modifyMemberSize(memberNo);
	}
	@Override
	public void modifyMemberSizeSave(RepositoryDTO rDto) throws Exception {
		// TODO Auto-generated method stub
		dao.modifyMemberSizeSave(rDto);
	}
	@Override
	public int selectCount(String userSearch, int userNo) {
		// TODO Auto-generated method stub
		return dao.selectCount(userSearch, userNo);
	}
	
}
