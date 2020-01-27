package com.palace.bowling_prj.controller;


import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@Autowired
	SqlSession sqlSession;

	@RequestMapping("/joinForm")
	public String joinForm() {
		// 로그인페이지 접속
		return "joinForm";
	}
	@RequestMapping("/userJoin")
	public String userJoin(HttpServletRequest request) {
		// 회원가입 실행
		BCryptPasswordEncoder passEncoder = new BCryptPasswordEncoder();
		String userId = request.getParameter("userId");
		String encode = passEncoder.encode(request.getParameter("userPassWord"));
		System.out.println("사용 아이디 =>"+userId);
		System.out.println("암호화된 비밀번호 =>"+encode);
		
		return "redirect:index";
	}
	
}
