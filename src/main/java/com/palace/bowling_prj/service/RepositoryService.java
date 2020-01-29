package com.palace.bowling_prj.service;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.palace.bowling_prj.common.PageNavigator;
import com.palace.bowling_prj_dto.RepositoryDTO;


public interface RepositoryService {
	public ArrayList<RepositoryDTO> indexView(int start, int end, String userSearch, int userNo) throws Exception;
	public void sizeWrite(RepositoryDTO rDto) throws Exception;
	public void deleteMemberSize(int memberNo) throws Exception;
	public RepositoryDTO sizeView(int memberNo) throws Exception;
	public RepositoryDTO modifyMemberSize(int memberNo) throws Exception;
	public void modifyMemberSizeSave(RepositoryDTO rDto)  throws Exception;
	public int selectCount(String userSearch);
	
	//준비중인 코드
	//검색 -> public ArrayList<RepositoryDto> userSearch(@Param("S_Val1") String searchKeyWord) throws Exception;

}
