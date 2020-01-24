package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.palace.bowling_prj.common.PageNavigator;
import com.palace.bowling_prj_dto.RepositoryDTO;

@Repository("rDao")
@Configuration("rDao")
public class RepositoryDAOImpl implements RepositoryDAO{
	
	@Autowired
	SqlSession sql;
	
	@Override
	public ArrayList<RepositoryDTO> indexView(int start, int end) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.indexView(start,end);
	}
	@Override
	public void sizeWrite(int tNo, String tName, String tPhone, String tRsize, String tMsize) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		idao.sizeWrite(tNo, tName, tPhone, tRsize, tMsize);
	}
	@Override
	public void deleteMemberSize(int userNo) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		idao.deleteMemberSize(userNo);
	}
	@Override
	public RepositoryDTO sizeView(int userNo) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.sizeView(userNo);
	}
	@Override
	public RepositoryDTO modifyMemberSize(int userNo) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.modifyMemberSize(userNo);
	}
	@Override
	public void modifyMemberSizeSave(int tNo, String tName, String tPhone, String tRsize, String tMsize, int userNo) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		idao.modifyMemberSizeSave(tNo,tName,tPhone,tRsize,tMsize, userNo);
	}
	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.selectCount();
	}
}
