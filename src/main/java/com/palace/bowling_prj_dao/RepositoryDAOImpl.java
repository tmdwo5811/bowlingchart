package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.palace.bowling_prj_dto.RepositoryDto;

@Repository("rDao")
@Configuration("rDao")
public class RepositoryDAOImpl implements RepositoryDAO{
	
	@Autowired
	SqlSession sql;
	
	@Override
	public ArrayList<RepositoryDto> indexView() throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.indexView();
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
	public RepositoryDto sizeView(int userNo) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.sizeView(userNo);
	}
	@Override
	public RepositoryDto modifyMemberSize(int userNo) throws Exception {
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
}
