package com.palace.bowling_prj.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.palace.bowling_prj_dto.RepositoryDto;


public interface RepositoryService {
	public ArrayList<RepositoryDto> indexView() throws Exception;
	public void sizeWrite(int tNo,String tName, String tPhone, String tRsize, String tMsize) throws Exception;
	public void deleteMemberSize(int userNo) throws Exception;
	public RepositoryDto sizeView(int userNo) throws Exception;
	public RepositoryDto modifyMemberSize(int userNo) throws Exception;
	public void modifyMemberSizeSave(int tNo, String tName, String tPhone, String tRsize, String tMsize, int userNo)  throws Exception;
	
	
	//준비중인 코드
	//검색 -> public ArrayList<RepositoryDto> userSearch(@Param("S_Val1") String searchKeyWord) throws Exception;
	//페이징처리 -> public int selectCount();

}
