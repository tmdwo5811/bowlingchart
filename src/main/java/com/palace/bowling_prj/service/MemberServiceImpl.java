package com.palace.bowling_prj.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.palace.bowling_prj_dao.MemberDAOImpl;
import com.palace.bowling_prj_dto.MemberDTO;


@Service("memberService")
@Configuration("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAOImpl dao;
	
	@Override
	public void userJoin(String userId, String userPassWord, String userEmail, String memName) throws Exception {
		// TODO Auto-generated method stub
		dao.userJoin(userId, userPassWord, userEmail, memName);
	}

	@Override
	public MemberDTO login(MemberDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<MemberDTO> loadUser(String getaId) {
		// TODO Auto-generated method stub
		return dao.loadUser(getaId);
	}
	
}
