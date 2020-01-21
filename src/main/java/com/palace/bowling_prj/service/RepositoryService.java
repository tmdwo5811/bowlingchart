package com.palace.bowling_prj.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.palace.bowling_prj_dto.RepositoryDto;

public interface RepositoryService {
	public ArrayList<RepositoryDto> indexView();
	public ArrayList<RepositoryDto> userSearch(@Param("S_Val1") String searchKeyWord);
	public RepositoryDto modifyMemberSize(int userNo);
	public RepositoryDto sizeView(int userNo);
	public void sizeWrite(@Param("Val1") int team_teamno,@Param("Val2") String username,@Param("Val3") String tPhone,@Param("Val4") String rfsize,@Param("Val5") String mfsize);
	public void deleteMemberSize(int userNo);
	public void modifyMemberSizeSave(@Param("M_Val1") int tNo,@Param("M_Val2") String tName,@Param("M_Val3") String tPhone,@Param("M_Val4") String tRsize,@Param("M_Val5") String tMsize,@Param("M_Val6") int userNo);
	public int selectCount();

}
