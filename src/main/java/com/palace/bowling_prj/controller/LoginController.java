package com.palace.bowling_prj.controller;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "loginPage";
	}
}
