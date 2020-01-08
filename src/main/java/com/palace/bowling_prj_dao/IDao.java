package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import com.palace.bowling_prj_dto.MemberDto;
import com.palace.bowling_prj_dto.RepositoryDto;

public interface IDao {
	public MemberDto loginDao();
	public RepositoryDto makeTeamDao();
	public ArrayList<RepositoryDto> teamListDao();
}
