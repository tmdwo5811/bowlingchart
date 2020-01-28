package com.palace.bowling_prj.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.palace.bowling_prj.service.MemberServiceImpl;
import com.palace.bowling_prj_dto.LoginDTO;
import com.palace.bowling_prj_dto.MemberDTO;

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
	public String login(HttpSession session, LoginDTO dto, HttpServletRequest request,Model model) throws Exception{
		
		System.out.println("LoginDTO Id 출력 =>" +dto.getaId());
		System.out.println("LoginDTO Pw 출력 =>" +dto.getaPw());
		MemberDTO mem = mService.loadUser(dto.getaId());
		
		System.out.println(mem.getUserPw());
		System.out.println("가져온 회원 번호 =>"+mem.getMemNo());
		
		if(passEncoder.matches(dto.getaPw(), mem.getUserPw())){
			System.out.println("계정정보 일치");
			session.setAttribute("userName", mem.getMemName());
			session.setAttribute("userNo", mem.getMemNo());
			return "redirect:list";
		}else {
			System.out.println("계정정보 불일치");
			model.addAttribute("resultMessage","ID 또는 패스워드가 틀립니다.");
			return "index";
		}
		
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
