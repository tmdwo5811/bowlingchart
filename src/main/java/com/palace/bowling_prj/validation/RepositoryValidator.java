package com.palace.bowling_prj.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.palace.bowling_prj_dto.RepositoryDTO;

public class RepositoryValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		return RepositoryDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(e, "memberName", "이름칸이 비어있거나 이름사이에 공백이 있습니다.");
		ValidationUtils.rejectIfEmpty(e, "memberPhone", "연락처칸이 비어있거나 연락처사이에 공백이있습니다.");
	}

}
