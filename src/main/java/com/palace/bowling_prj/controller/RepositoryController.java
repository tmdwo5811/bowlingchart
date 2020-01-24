package com.palace.bowling_prj.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.palace.bowling_prj.common.PagingDTO;
import com.palace.bowling_prj.service.RepositoryServiceImpl;
import com.palace.bowling_prj.service.TeamServiceImpl;
import com.palace.bowling_prj_dto.RepositoryDTO;

@Controller
public class RepositoryController {
	
	@Autowired
	RepositoryServiceImpl rService;
	
	@Autowired
	TeamServiceImpl tService;
	
	@RequestMapping("/index")
	public String index(Model model) throws Exception {
		// 메인 페이지 접속
		PagingDTO page = new PagingDTO(0, 0, 0, 0);

		ArrayList<RepositoryDTO> al = rService.indexView();
		model.addAttribute("main",al);
		return "index";
	}
	@RequestMapping("/sizeWrite")	
	public String writePage(Model model) {
		// 지공 사이즈 작성페이지 접속
		
		model.addAttribute("teamList",tService.teamListDao());
		return "sizeWrite";
	}
	@RequestMapping("/makeTeam")
	public String makeTeam(HttpServletRequest request,Model model) {
		//DB로 팀 이름 저장 메소드
		
		String tName = request.getParameter("wTeam");
		tService.makeTeam(tName);
		return "redirect:sizeWrite";
	}
	@RequestMapping("/deleteTeam")
	public String deleteTeam(HttpServletRequest request,Model model) {
		//팀 삭제 구문
		
		int tNo = Integer.parseInt(request.getParameter("teamNo"));
		tService.deleteTeam(tNo);
		return "redirect:sizeWrite";
	}
	@RequestMapping("/sizeSave")
	public String sizeWrite(HttpServletRequest request,Model model) {
		//저장소로 지공 사이즈 저장 메소드
		
		int tNo = Integer.parseInt(request.getParameter("teamNo"));
		String tName = request.getParameter("bName");
		String tPhone = request.getParameter("bPhone");
		String tMsize = request.getParameter("bMsize");
		String tRsize = request.getParameter("bRsize");
		try {
			rService.sizeWrite(tNo, tName, tPhone, tRsize, tMsize);
			System.out.println("size 저장 요청 내용");
			System.out.println(tNo+" "+ tName +" "+ tPhone +" "+ tRsize +" "+ tMsize);
			System.out.println("size 입력 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:index";
	}

	@RequestMapping("/deleteMemberSize")
	public String deleteMemberSize(HttpServletRequest request,Model model) {
		int userNo = Integer.parseInt(request.getParameter("userNo"));
		try {
			rService.deleteMemberSize(userNo);
			System.out.println("삭제요청한 "+userNo+"번 회원");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:index";
	}
	@RequestMapping("/sizeView")
	public String sizeView(HttpServletRequest request,Model model) throws Exception {
		//멤버 사이즈 상세 페이지 접속
		int userNo = Integer.parseInt(request.getParameter("userNo"));
		System.out.println(userNo+" 번 회원 조회 요청");
		RepositoryDTO sv = rService.sizeView(userNo);
		model.addAttribute("memberSize",sv);
		return "sizeView";
	}
	@RequestMapping("/modifySizePage")
	public String modifySizePage(HttpServletRequest request, Model model) throws Exception{
		//회원 정보 수정 페이지 접속
		int userNo = Integer.parseInt(request.getParameter("userNo"));
		System.out.println(userNo+"번 회원 정보 수정 페이지 접속");
		model.addAttribute("memberSize",rService.modifyMemberSize(userNo));
		model.addAttribute("teamList",tService.teamListDao());
		return "sizeModify";
	}

	@RequestMapping("/modifyMemberSizeSave")
	public String modifyMemberSizeSave(HttpServletRequest request) {
		//회원 정보 저장 요청
		
		int userNo = Integer.parseInt(request.getParameter("userNo"));
		int tNo = Integer.parseInt(request.getParameter("teamNo"));
		String tName = request.getParameter("bName");
		String tPhone = request.getParameter("bPhone");
		String tMsize = request.getParameter("bMsize");
		String tRsize = request.getParameter("bRsize");
		System.out.println("size 수정 요청 내용");
		System.out.println(tNo+" "+ tName +" "+ tPhone +" "+ tRsize +" "+ tMsize);
		try {
			rService.modifyMemberSizeSave(tNo,tName,tPhone,tRsize,tMsize, userNo);
			System.out.println("size 수정 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:index";
	}
	/*
	@RequestMapping("/userSearch")
	public String userSearch(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		String searchKeyWord = request.getParameter("userSearch");
		System.out.println("검색하려는 데이터 => "+searchKeyWord);
		model.addAttribute("main",dao.userSearch(searchKeyWord));
		return "redirect:index";
	}
	
	
	
	
	
	*/
}
