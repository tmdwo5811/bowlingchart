package com.palace.bowling_prj_dao;

import org.apache.commons.mail.HtmlEmail;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.palace.bowling_prj_dto.UserDTO;

@Repository("uDao")
@Configuration("uDao")
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	SqlSession sql;
	
	@Override
	public void userJoin(UserDTO uDto) throws Exception {
		// TODO Auto-generated method stub
		UserDAO dao = sql.getMapper(UserDAO.class);
		dao.userJoin(uDto);
	}
	@Override
	public UserDTO loadUser(String getaId) throws Exception {
		// TODO Auto-generated method stub
		UserDAO dao = sql.getMapper(UserDAO.class);
		return dao.loadUser(getaId);
	}
	@Override
	public int updatePw(UserDTO uDto) throws Exception {
		// TODO Auto-generated method stub
		UserDAO dao = sql.getMapper(UserDAO.class);
		return dao.updatePw(uDto);
	}

	@Override
	public void changeUserPw(String encode, String userId) throws Exception {
		// TODO Auto-generated method stub
		UserDAO dao = sql.getMapper(UserDAO.class);
		dao.changeUserPw(encode, userId);
	}
	@Override
	public void sendEmail(UserDTO uDto, String div) throws Exception {
		// TODO Auto-generated method stub
		String charSet = "utf-8";
		String hostSMTP = "smtp.naver.com";
		String hostSMTPid= "santjsmtp";
		String hostSMTPpwd = "ysj*3575811";
		
		String fromEmail = "santjsmtp@naver.com";
		String fromName = "SeungJae Yoon Developer";
		String subject ="";
		String msg = "";
		
		if(div.equals("findPw")) {
			subject = "Bowling Web Program 이용 임시 비밀번호 입니다.";
			msg += "<div align='center' style='border:1px solid black; font-family:verdana'>";
			msg += "<h2 style='color:blue;'>";
			msg += uDto.getUserId()+"님의 임시 비밀번호 입니다. 비밀번호를 변경하여 사용하세요.";
			msg += "<p>임시 비밀번호 : ";
			msg += uDto.getUserPw() + "</p></div>";
		}
		
		String userEmail = uDto.getUserEmail();
		try {
			HtmlEmail email = new HtmlEmail();
			email.setDebug(true);
			email.setCharset(charSet);
			email.setSSL(true);
			email.setHostName(hostSMTP);
			email.setSmtpPort(587);
	
			email.setAuthentication(hostSMTPid, hostSMTPpwd);
			email.setTLS(true);
			email.addTo(userEmail,charSet);
			email.setFrom(fromEmail,fromName,charSet);
			email.setSubject(subject);
			email.setHtmlMsg(msg);
			email.send();
		}catch (Exception e) {
			System.out.println("이메일 발송 실패 : " + e);
		}
	}
	@Override
	public int idCheck(UserDTO uDto) throws Exception {
		// TODO Auto-generated method stub
		int result = sql.selectOne("memberMapper.idCheck",uDto);
		return result;
	}
}
