package com.palace.bowling_prj.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		// 로그아웃 세션 해제
		session.invalidate();
		return "index";
	}

	@RequestMapping("/index")
	public String index(HttpSession session) {
		// 로그인 메인 페이지 접속
		session.invalidate();
		return "index";
	}

	@RequestMapping("/joinForm")
	public String joinForm() {
		// 회원가입 페이지 접속
		return "joinForm";
	}

	@RequestMapping("/findPwForm")
	public String findPwForm() {
		// 비밀번호 초기화 페이지 접속
		return "findPw";
	}

	@RequestMapping("/changeUserPwForm")
	public String changeUserPwForm() {
		// 비밀번호 변경 페이지 접속
		return "changePw";
	}

	@RequestMapping("/changePassword")
	public String changeUserPw(HttpSession session, HttpServletRequest request, Model model) throws Exception {

		UserDTO mem = mService.loadUser((String) session.getAttribute("userId"));

		if (passEncoder.matches(request.getParameter("userPw"), mem.getUserPw())) {
			System.out.println("비밀번호 일치");
			String userId = (String) session.getAttribute("userId");
			String encode = passEncoder.encode(request.getParameter("userNewPw"));
			mService.changeUserPw(encode, userId);
			session.invalidate();
			return "index";
		} else {
			System.out.println("현재 비밀번호가 틀렸습니다.");
			model.addAttribute("resultMessage", "현재 비밀번호가 틀렸습니다.");
			return "changePw";
		}
	}

	@RequestMapping("/login")
	public String login(HttpSession session, LoginDTO dto, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			UserDTO mem = mService.loadUser(dto.getaId());
			if (passEncoder.matches(dto.getaPw(), mem.getUserPw())) {
				System.out.println("계정정보 일치");
				session.setAttribute("userName", mem.getUserName());
				session.setAttribute("userNo", mem.getUserNo());
				session.setAttribute("userId", mem.getUserId());
				return "redirect:list";
			} else {
				System.out.println("비밀번호 불일치");
				out.println("<script>alert('패스워드가 다릅니다.');</script>");
				out.flush();
				return "index";
			}
		} catch (Exception e) {
			System.out.println(e + "없는 계정입니다.");
			out.println("<script>alert('존재하지 않는 계정입니다.');</script>");
			out.flush();
			return "index";
		}
	}

	@RequestMapping("/userJoin")
	public String userJoin(@ModelAttribute @Valid UserDTO uDto, BindingResult result) throws Exception {
		// 회원가입 실행

		if (result.hasErrors()) {
			return "joinForm";
		} else {
			String encode = passEncoder.encode(uDto.getUserPw());
			uDto.setUserPw(encode);
			mService.userJoin(uDto);
			return "redirect:index";
		}
	}

	@RequestMapping("/findPw")
	public String findUserPw(@ModelAttribute UserDTO uDto, HttpServletResponse response, Model model){
		
		try {
			mService.updatePw(response, uDto);
			PrintWriter out = response.getWriter();
			response.setContentType("text/html;charset=utf-8");
			out.println("<script language='javascript'>");
			out.println("alert('이메일로 임시 비밀번호가 발송되었습니다.')");
			out.println("</script>");
			out.flush();
			return "index";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("resultMessage", "없는 이메일 또는 옮바르지않은 이메일 형식입니다.");
			return "findPw";
		}
	}

}
