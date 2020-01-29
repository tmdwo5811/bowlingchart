package com.palace.bowling_prj_dao;

import org.apache.ibatis.annotations.Param;

import com.palace.bowling_prj_dto.UserDTO;

public interface UserDAO {

	public void userJoin(@Param("userId") String userId,@Param("userPw") String encode,@Param("userEmail") String userEmail,@Param("userName") String userName) throws Exception;
	public UserDTO loadUser(@Param("aId") String getaId);
}
