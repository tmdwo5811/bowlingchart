package com.palace.bowling_prj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.palace.bowling_prj.service.UserServiceImpl;
import com.palace.bowling_prj_dto.LoginDTO;
import com.palace.bowling_prj_dto.UserDTO;

@Controller
public class LoginController {

	@Autowired
	UserServiceImpl mService;
	
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//로그아웃 세션 해제
		session.invalidate();
		return "index";
	}

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
	public String login(HttpSession session, LoginDTO dto, HttpServletRequest request,Model model) throws Exception{
		
		UserDTO mem = mService.loadUser(dto.getaId());
		
		if(passEncoder.matches(dto.getaPw(), mem.getUserPw())){
			System.out.println("계정정보 일치");
			session.setAttribute("userName", mem.getUserName());
			session.setAttribute("userNo", mem.getUserNo());
			return "redirect:list";
		}else {
			System.out.println("계정정보 불일치");
			model.addAttribute("resultMessage","ID 또는 패스워드가 틀립니다.");
			return "index";
		}
		
	}
	@RequestMapping("/userJoin")
	public String userJoin(UserDTO uDto, HttpServletRequest request) {
		// 회원가입 실행
		String userId = request.getParameter("userId");
		String encode = passEncoder.encode(request.getParameter("userPw"));
		String userEmail = request.getParameter("userEmail");
		String userName = request.getParameter("userName");
		try {
			mService.userJoin(userId,encode,userEmail,userName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:index";
	}
	
}
