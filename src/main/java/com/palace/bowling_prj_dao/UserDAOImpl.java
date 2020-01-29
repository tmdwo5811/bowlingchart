package com.palace.bowling_prj_dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.palace.bowling_prj_dto.UserDTO;

@Repository("uDao")
@Configuration("uDao")
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	SqlSession sql;
	
	@Override
	public void userJoin(String userId, String encode, String userEmail, String userName) throws Exception {
		// TODO Auto-generated method stub
		UserDAO dao = sql.getMapper(UserDAO.class);
		dao.userJoin(userId,encode,userEmail,userName);
	}
	@Override
	public UserDTO loadUser(String getaId) {
		// TODO Auto-generated method stub
		UserDAO dao = sql.getMapper(UserDAO.class);
		return dao.loadUser(getaId);
	}
}
