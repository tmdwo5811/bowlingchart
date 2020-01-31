package com.palace.bowling_prj.service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.palace.bowling_prj_dao.UserDAOImpl;
import com.palace.bowling_prj_dto.UserDTO;


@Service("userService")
@Configuration("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAOImpl dao;
	
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	@Override
	public void userJoin(UserDTO uDto) throws Exception {
		// TODO Auto-generated method stub
		dao.userJoin(uDto);
	}

	public UserDTO loadUser(String getaId) throws Exception {
		// TODO Auto-generated method stub
		return dao.loadUser(getaId);
	}
	@Override
	public void changeUserPw(String encode, String userId) throws Exception {
		// TODO Auto-generated method stub
		dao.changeUserPw(encode, userId);
	}
	@Override
	public void updatePw(HttpServletResponse response, UserDTO uDto) throws Exception {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(uDto.getUserId() == null) {
			out.print("아이디가 없습니다.");
			out.close();
		} else if(!uDto.getUserEmail().equals(dao.loadUser(uDto.getUserId()).getUserEmail())) {
			out.print("잘못된 이메일 입니다.");
			out.close();
		} else {
			String pw = "";
			for (int i=0;i<12;i++) {
				pw += (char) ((Math.random() * 26)+97);
			}
			String encode = passEncoder.encode(pw);
			uDto.setUserPw(encode);
			dao.updatePw(uDto);
			uDto.setUserPw(pw);
			dao.sendEmail(uDto,"findPw");
			out.print("이메일로 임시 비밀번호를 발송하였습니다.");
			out.close();
		}
	}
	
}
