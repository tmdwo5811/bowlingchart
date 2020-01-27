package com.palace.bowling_prj.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.palace.bowling_prj.service.MemberServiceImpl;

@Controller
public class LoginController {

	@Autowired
	MemberServiceImpl mService;

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
		String userEmail = request.getParameter("userEmail");
		String memName = request.getParameter("memName");
		try {
			mService.userJoin(userId, encode, userEmail, memName);
			System.out.println("회원가입 실행");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:index";
	}
	
}
