package com.palace.bowling_prj.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.palace.bowling_prj_dao.IDao;

@Controller
public class LoginController {

	@Autowired
	SqlSession sqlSession;

	@RequestMapping("/loginPage")
	public String loginPage() {
		// 로그인페이지 접속
		return "loginPage";
	}

	@RequestMapping("/index")
	public String index() {
		// 로그인페이지 접속
		return "index";
	}

	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		// 로그인 실행 컨트롤러
		IDao dao = sqlSession.getMapper(IDao.class);
		
		model.addAttribute("login", dao.loginDao());
		return "index";
	}
}
