package com.palace.bowling_prj.service;

import com.palace.bowling_prj_dto.MemberDTO;

public interface MemberService {
	
	public void userJoin(String userId, String userPassWord, String userEmail, String memName) throws Exception;
	public MemberDTO login(MemberDTO dto) throws Exception;
}
