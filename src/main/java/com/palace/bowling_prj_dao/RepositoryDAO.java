package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.palace.bowling_prj.common.PageNavigator;
import com.palace.bowling_prj_dto.RepositoryDTO;

public interface RepositoryDAO {
	public ArrayList<RepositoryDTO> indexView(int start, int end) throws Exception;
	public void sizeWrite(@Param("sVal1") int tNo,@Param("sVal2") String tName,@Param("sVal3") String tPhone,@Param("sVal4") String tRsize,@Param("sVal5") String tMsize) throws Exception;
	public void deleteMemberSize(int userNo) throws Exception;
	public RepositoryDTO sizeView(int userNo) throws Exception;
	public RepositoryDTO modifyMemberSize(int userNo) throws Exception;
	public void modifyMemberSizeSave(@Param("M_Val1") int tNo,@Param("M_Val2") String tName,@Param("M_Val3") String tPhone,@Param("M_Val4") String tRsize,@Param("M_Val5") String tMsize,@Param("M_Val6") int userNo)  throws Exception;
	public int selectCount();
	//준비중인 코드
	//검색 -> public ArrayList<RepositoryDto> userSearch(@Param("S_Val1") String searchKeyWord) throws Exception;

}
