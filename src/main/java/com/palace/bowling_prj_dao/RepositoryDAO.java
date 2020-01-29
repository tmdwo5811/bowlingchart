package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.palace.bowling_prj.common.PageNavigator;
import com.palace.bowling_prj_dto.RepositoryDTO;

public interface RepositoryDAO {
	public ArrayList<RepositoryDTO> indexView(@Param("start")int start,@Param("end") int end,@Param("userSearch")String userSearch,@Param("userNo") int userNo) throws Exception;
	public void sizeWrite(RepositoryDTO rDto) throws Exception;
	public void deleteMemberSize(int memberNo) throws Exception;
	public RepositoryDTO sizeView(int memberNo) throws Exception;
	public RepositoryDTO modifyMemberSize(int memberNo) throws Exception;
	public void modifyMemberSizeSave(RepositoryDTO rDto)  throws Exception;
	public int selectCount(@Param("userSearchCount") String userSearch);
}
