package com.palace.bowling_prj.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.palace.bowling_prj.service.MemberServiceImpl;
import com.palace.bowling_prj_dto.LoginDTO;

@Controller
public class LoginController {

	@Autowired
	MemberServiceImpl mService;
	
	@Autowired
	BCryptPasswordEncoder passEncoder;

	@RequestMapping("/index")
	public String index() {
	//로그인 메인 페이지 접속
		return "index";
	}
	
	@RequestMapping("/joinForm")
	public String joinForm() {
		// 회원가입 페이지 접속
		return "joinForm";
	}
	@RequestMapping("/login")
	public String login(LoginDTO dto, HttpServletRequest request) throws Exception{
		
		
		HttpSession session = request.getSession();
		
		return "redirect:list";
	}
	@RequestMapping("/userJoin")
	public String userJoin(HttpServletRequest request) {
		// 회원가입 실행
		
		String userId = request.getParameter("userId");
		String encode = passEncoder.encode(request.getParameter("userPassWord"));
		String userEmail = request.getParameter("userEmail");
		String memName = request.getParameter("memName");
		try {
			mService.userJoin(userId, encode, userEmail, memName);
			System.out.println("회원가입 실행 입력한 아이디 => "+userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:index";
	}
	
}
