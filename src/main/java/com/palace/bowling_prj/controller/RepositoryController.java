package com.palace.bowling_prj.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.palace.bowling_prj.common.PageNavigator;
import com.palace.bowling_prj.service.RepositoryServiceImpl;
import com.palace.bowling_prj.service.TeamServiceImpl;
import com.palace.bowling_prj_dto.RepositoryDTO;

@Controller
public class RepositoryController {

	private RepositoryServiceImpl rService;
	private TeamServiceImpl tService;

	@Autowired
	public RepositoryController(RepositoryServiceImpl rService, TeamServiceImpl tService) {
		// TODO Auto-generated constructor stub
		this.rService = rService;
		this.tService = tService;

	}

	@RequestMapping("/list")
	public String index(ModelMap model, @RequestParam(defaultValue = "1") int curPage,
			@RequestParam(defaultValue = "") String userSearch, HttpSession session) throws Exception {
		// 메인 페이지 접속

		System.out.println(curPage + "<= 처음으로 눌렀을때 가져온 값");
		System.out.println(userSearch + "<= 검색하려는 회원 명");
		int userNo = (Integer) session.getAttribute("userNo");
		int count = rService.selectCount(userSearch);
		System.out.println("토탈 회원 데이터" + count);
		PageNavigator pp = new PageNavigator(count, curPage);
		int start = pp.getPageBegin();
		int end = pp.getPageEnd();
		ArrayList<RepositoryDTO> list = rService.indexView(start, end, userSearch, userNo);
		model.addAttribute("main", list);
		model.addAttribute("navi", pp);
		model.addAttribute("userSearch", userSearch);
		return "list";
	}

	@RequestMapping("/sizeWrite")
	public String writePage(Model model) {
		// 지공 사이즈 작성페이지 접속
		model.addAttribute("teamList", tService.teamListDao());
		return "sizeWrite";
	}

	@RequestMapping("/makeTeam")
	public String makeTeam(HttpServletRequest request, Model model) {
		// DB로 팀 이름 저장 메소드

		String tName = request.getParameter("wTeam");
		tService.makeTeam(tName);
		return "redirect:sizeWrite";
	}

	@RequestMapping("/deleteTeam")
	public String deleteTeam(HttpServletRequest request, Model model) {
		// 팀 삭제 구문

		int tNo = Integer.parseInt(request.getParameter("teamNo"));
		tService.deleteTeam(tNo);
		return "redirect:sizeWrite";
	}

	@RequestMapping("/sizeSave")
	public String sizeWrite(@ModelAttribute @Valid RepositoryDTO rDto, BindingResult result) throws Exception {
		// 저장소로 지공 사이즈 저장 메소드
		if (result.hasErrors()) {
			return "redirect:sizeWrite";
		} else {
			rService.sizeWrite(rDto);
			return "redirect:list";
		}
	}

	@RequestMapping("/deleteMemberSize")
	public String deleteMemberSize(HttpServletRequest request, Model model) {
		int memberNo = Integer.parseInt(request.getParameter("memberNo"));
		try {
			rService.deleteMemberSize(memberNo);
			System.out.println("삭제요청한 " + memberNo + "번 회원");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:list";
	}

	@RequestMapping("/sizeView")
	public String sizeView(HttpServletRequest request, Model model) throws Exception {
		// 멤버 사이즈 상세 페이지 접속
		int memberNo = Integer.parseInt(request.getParameter("memberNo"));
		System.out.println(memberNo + " 번 회원 조회 요청");
		RepositoryDTO sv = rService.sizeView(memberNo);
		model.addAttribute("memberSize", sv);
		return "sizeView";
	}

	@RequestMapping("/modifySizePage")
	public String modifySizePage(HttpServletRequest request, Model model) throws Exception {
		// 회원 정보 수정 페이지 접속
		int memberNo = Integer.parseInt(request.getParameter("memberNo"));
		System.out.println(memberNo + "번 회원 정보 수정 페이지 접속");
		model.addAttribute("memberSize", rService.modifyMemberSize(memberNo));
		model.addAttribute("teamList", tService.teamListDao());
		return "sizeModify";
	}

	@RequestMapping("/modifyMemberSizeSave")
	public String modifyMemberSizeSave(@ModelAttribute @Valid RepositoryDTO rDto, HttpServletRequest request, BindingResult result) throws Exception {
		// 회원 정보 저장 요청
		// 수정해야할 메소드 사이즈 입력이 안됨
			if(result.hasErrors()) {
				return "redirect:modifySizePage";
			} else {
			rService.modifyMemberSizeSave(rDto);
			System.out.println("size 수정 성공");
			return "redirect:list";
			}
	}

}
