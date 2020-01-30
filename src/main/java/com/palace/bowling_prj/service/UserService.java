package com.palace.bowling_prj.service;

import com.palace.bowling_prj_dto.UserDTO;

public interface UserService {
	
	public void userJoin(UserDTO uDto) throws Exception;
	public UserDTO loadUser(String getaId) throws Exception;
}
