package com.palace.bowling_prj.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.palace.bowling_prj_dao.IDao;

@Controller
public class RepositoryController {
	
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping("/sizeWrite")	
	public String writePage(Model model) {
		// 지공 사이즈 작성페이지 접속
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("teamList",dao.teamListDao());

		return "sizeWrite";
	}
	
	@RequestMapping("/sizeSave")
	public String sizeWrite(HttpServletRequest request, Model model) {
		//저장소로 지공 사이즈 저장 메소드
		
		return "index";
	}
	@RequestMapping("/makeTeam")
	public String makeTeam(HttpServletRequest request,Model model) {
		//DB로 팀 이름 저장 메소드
		IDao dao = sqlSession.getMapper(IDao.class);
		String tName = request.getParameter("wTeam");
		dao.makeTeam(tName);
		System.out.println("생성 요청 팀 이름 = "+tName);
		return "redirect:sizeWrite";
	}
	@RequestMapping("/deleteTeam")
	public String deleteTeam(HttpServletRequest request,Model model) {
		//팀 삭제 구문
		IDao dao = sqlSession.getMapper(IDao.class);
		int tNo = Integer.parseInt(request.getParameter("teamNo"));
		dao.deleteTeam(tNo);
		System.out.println("삭제 요청한 팀번호"+tNo);
		
		return "redirect:sizeWrite";
	}
	
}
