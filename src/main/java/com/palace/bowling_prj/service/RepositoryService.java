package com.palace.bowling_prj.service;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.palace.bowling_prj.common.PageNavigator;
import com.palace.bowling_prj_dto.RepositoryDTO;


public interface RepositoryService {
	public ArrayList<RepositoryDTO> indexView(int start, int end, String userSearch) throws Exception;
	public void sizeWrite(int tNo,String tName, String tPhone, String tRsize, String tMsize) throws Exception;
	public void deleteMemberSize(int userNo) throws Exception;
	public RepositoryDTO sizeView(int userNo) throws Exception;
	public RepositoryDTO modifyMemberSize(int userNo) throws Exception;
	public void modifyMemberSizeSave(int tNo, String tName, String tPhone, String tRsize, String tMsize, int userNo)  throws Exception;
	public int selectCount(String userSearch);
	
	//준비중인 코드
	//검색 -> public ArrayList<RepositoryDto> userSearch(@Param("S_Val1") String searchKeyWord) throws Exception;

}
