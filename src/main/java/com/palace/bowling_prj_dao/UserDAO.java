package com.palace.bowling_prj_dao;

import org.apache.ibatis.annotations.Param;

import com.palace.bowling_prj_dto.UserDTO;

public interface UserDAO {

	public void userJoin(UserDTO uDto) throws Exception;
	public UserDTO loadUser(@Param("aId") String getaId);
}
