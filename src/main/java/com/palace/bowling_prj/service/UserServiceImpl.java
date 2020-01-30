package com.palace.bowling_prj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.palace.bowling_prj_dao.UserDAOImpl;
import com.palace.bowling_prj_dto.UserDTO;


@Service("userService")
@Configuration("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAOImpl dao;
	
	@Override
	public void userJoin(UserDTO uDto) throws Exception {
		// TODO Auto-generated method stub
		dao.userJoin(uDto);
	}

	public UserDTO loadUser(String getaId) {
		// TODO Auto-generated method stub
		return dao.loadUser(getaId);
	}
	
}
