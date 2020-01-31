package com.palace.bowling_prj_dao;

import org.apache.ibatis.annotations.Param;

import com.palace.bowling_prj_dto.UserDTO;

public interface UserDAO {

	public void userJoin(UserDTO uDto) throws Exception;
	public UserDTO loadUser(@Param("aId") String getaId) throws Exception;
	public int updatePw(UserDTO uDto) throws Exception;
	public void sendEmail(UserDTO uDto, String div) throws Exception;
	public void changeUserPw(@Param("newPw") String encode,@Param("userId") String userNo) throws Exception;
}
