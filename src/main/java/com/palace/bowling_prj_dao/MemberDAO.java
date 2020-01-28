package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.palace.bowling_prj_dto.MemberDTO;

public interface MemberDAO {

	public void userJoin(@Param("userId") String userId,@Param("userPw") String userPassWord,@Param("userEmail") String userEmail,@Param("memName") String memName) throws Exception;
	public MemberDTO loadUser(@Param("aId") String getaId);
}
