package com.palace.bowling_prj.controller;

import java.io.IOException;
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
import org.springframework.web.bind.annotation.ResponseBody;

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

	@RequestMapping(value= {"/","/index"})
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
	public String changeUserPw(HttpSession session, HttpServletRequest request, Model model,
			HttpServletResponse response) throws Exception {

		response.setContentType("text/html;charset=utf-8");
		UserDTO mem = mService.loadUser((String) session.getAttribute("userId"));
		PrintWriter out = response.getWriter();
		if (passEncoder.matches(request.getParameter("userPw"), mem.getUserPw())) {
			System.out.println("비밀번호 일치");
			String userId = (String) session.getAttribute("userId");
			String encode = passEncoder.encode(request.getParameter("userNewPw"));
			mService.changeUserPw(encode, userId);
			out.println("<script>alert('비밀번호가 변경 처리 되었습니다. 로그인 페이지로 이동됩니다.');location.href='/bowling_prj/index';</script>");
			out.flush();
			return "index";
		} else {
			out.println("<script>alert('현재 비밀번호가 옮바르지 않습니다. 다시 확인하여 주세요');</script>");
			out.flush();
			return "changePw";
		}
	}

	@RequestMapping("/login")
	public String login(HttpSession session, LoginDTO dto, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
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
	public String userJoin(@ModelAttribute @Valid UserDTO uDto, BindingResult result, HttpServletResponse response)
			throws Exception {
		// 회원가입 실행

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int checkResult = mService.idCheck(uDto);
		if (result.hasErrors()) {
			// ID 중복 체크 메소드 수정해야함
			return "joinForm";
		} else {
			try {
				if (checkResult == 1) {
					return "joinForm";
				} else if (checkResult == 0) {
					String encode = passEncoder.encode(uDto.getUserPw());
					uDto.setUserPw(encode);
					mService.userJoin(uDto);
					out.println("<script>alert('회원가입이 완료되었습니다.');</script>");
					out.flush();
				}
			} catch (Exception e) {
				System.out.println("에러 내용 =>" + e);
			}
			return "index";
		}
	}
	@ResponseBody
	@RequestMapping("/idCheck")
	public int idCheck(UserDTO uDto) throws Exception {
		int result = mService.idCheck(uDto);
		return result;
	}

	@RequestMapping("/findPw")
	public String findUserPw(@ModelAttribute UserDTO uDto, HttpServletResponse response, Model model)
			throws IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		try {
			mService.updatePw(response, uDto);
//			out.println("<script language='javascript'>");
//			out.println("alert('이메일로 임시 비밀번호가 발송되었습니다.')");
//			out.println("</script>");
			out.flush();
			return "index";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("<script>alert('없는 이메일 또는 옮바르지 않은 이메일 형식입니다.');</script>");
			out.flush();
			return "findPw";
		}
	}
}
