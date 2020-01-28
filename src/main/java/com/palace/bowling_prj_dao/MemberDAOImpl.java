package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.palace.bowling_prj_dto.MemberDTO;

@Repository("mDao")
@Configuration("mDao")
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	SqlSession sql;
	
	@Override
	public void userJoin(String userId, String userPassWord, String userEmail, String memName) throws Exception {
		// TODO Auto-generated method stub
		MemberDAO dao = sql.getMapper(MemberDAO.class);
		dao.userJoin(userId, userPassWord, userEmail, memName);
	}
	@Override
	public ArrayList<MemberDTO> loadUser(String getaId) {
		// TODO Auto-generated method stub
		MemberDAO dao = sql.getMapper(MemberDAO.class);
		return dao.loadUser(getaId);
	}
}
