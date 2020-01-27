package com.palace.bowling_prj_dao;

import org.apache.ibatis.annotations.Param;

public interface MemberDAO {

	public void userJoin(@Param("userId") String userId,@Param("userPw") String userPassWord,@Param("userEmail") String userEmail,@Param("memName") String memName) throws Exception;
}
