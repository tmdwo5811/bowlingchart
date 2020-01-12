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
	
	@RequestMapping("/index")
	public String index(Model model) {
		// 메인 페이지 접속
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("main",dao.indexView());
		return "index";
	}
	@RequestMapping("/modifySizePage")
	public String modifySizePage(HttpServletRequest request, Model model) {
		//회원 정보 수정 페이지 접속
		IDao dao = sqlSession.getMapper(IDao.class);
		int userNo = Integer.parseInt(request.getParameter("userNo"));
		System.out.println(userNo+"번 회원 정보 수정 페이지 접속");
		model.addAttribute("memberSize",dao.modifyMemberSize(userNo));
		model.addAttribute("teamList",dao.teamListDao());
		return "sizeModify";
	}
	@RequestMapping("/modifyMemberSizeSave")
	public String modifyMemberSizeSave(HttpServletRequest request) {
		//회원 정보 저장 요청
		IDao dao = sqlSession.getMapper(IDao.class);
		int userNo = Integer.parseInt(request.getParameter("userNo"));
		int tNo = Integer.parseInt(request.getParameter("teamNo"));
		String tName = request.getParameter("bName");
		String tPhone = request.getParameter("bPhone");
		String tMsize = request.getParameter("bMsize");
		String tRsize = request.getParameter("bRsize");
		System.out.println("size 수정 요청 내용");
		System.out.println(tNo+" "+ tName +" "+ tPhone +" "+ tRsize +" "+ tMsize);
		dao.modifyMemberSizeSave(tNo,tName,tPhone,tRsize,tMsize, userNo);
		System.out.println("size 수정 성공");
		
		return "redirect:index";
	}
	
	@RequestMapping("/deleteMemberSize")
	public String deleteMemberSize(HttpServletRequest request,Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		int userNo = Integer.parseInt(request.getParameter("userNo"));
		dao.deleteMemberSize(userNo);
		System.out.println("삭제요청한 "+userNo+"번 회원");
		return "redirect:index";
	}
	
	@RequestMapping("/sizeView")
	public String sizeView(HttpServletRequest request,Model model) {
		//멤버 사이즈 상세 페이지 접속
		IDao dao = sqlSession.getMapper(IDao.class);
		int userNo = Integer.parseInt(request.getParameter("userNo"));
		System.out.println(userNo+" 번 회원 조회 요청");
		model.addAttribute("memberSize",dao.sizeView(userNo));
		return "sizeView";
	}
	
	@RequestMapping("/sizeWrite")	
	public String writePage(Model model) {
		// 지공 사이즈 작성페이지 접속
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("teamList",dao.teamListDao());

		return "sizeWrite";
	}
	
	@RequestMapping("/sizeSave")
	public String sizeWrite(HttpServletRequest request,Model model) {
		//저장소로 지공 사이즈 저장 메소드
		IDao dao = sqlSession.getMapper(IDao.class);

		int tNo = Integer.parseInt(request.getParameter("teamNo"));
		String tName = request.getParameter("bName");
		String tPhone = request.getParameter("bPhone");
		String tMsize = request.getParameter("bMsize");
		String tRsize = request.getParameter("bRsize");
		System.out.println("size 저장 요청 내용");
		System.out.println(tNo+" "+ tName +" "+ tPhone +" "+ tRsize +" "+ tMsize);
		dao.sizeWrite(tNo,tName,tPhone,tRsize,tMsize);
		System.out.println("size 입력 성공");
		return "redirect:index";
	}
	
	@RequestMapping("/makeTeam")
	public String makeTeam(HttpServletRequest request,Model model) {
		//DB로 팀 이름 저장 메소드
		IDao dao = sqlSession.getMapper(IDao.class);
		String tName = request.getParameter("wTeam");
		System.out.println("생성 요청 팀 이름 = "+tName);
		dao.makeTeam(tName);
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
