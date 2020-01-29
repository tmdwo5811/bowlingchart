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
	private SqlSession sql;

	@Override
	public ArrayList<RepositoryDTO> indexView(int start, int end,String userSearch, int userNo) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.indexView(start,end, userSearch, userNo);
	}
	@Override
	public void sizeWrite(RepositoryDTO rDto) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		idao.sizeWrite(rDto);
	}
	@Override
	public void deleteMemberSize(int userNo) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		idao.deleteMemberSize(userNo);
	}
	@Override
	public RepositoryDTO sizeView(int memberNo) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.sizeView(memberNo);
	}
	@Override
	public RepositoryDTO modifyMemberSize(int memberNo) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.modifyMemberSize(memberNo);
	}
	@Override
	public void modifyMemberSizeSave(RepositoryDTO rDto) throws Exception {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		idao.modifyMemberSizeSave(rDto);
	}
	@Override
	public int selectCount(String userSearch) {
		// TODO Auto-generated method stub
		RepositoryDAO idao = sql.getMapper(RepositoryDAO.class);
		return idao.selectCount(userSearch);
	}
}
