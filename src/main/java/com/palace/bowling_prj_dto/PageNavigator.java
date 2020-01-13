package com.palace.bowling_prj_dto;

public class PageNavigator {
	
	//페이지 관련 정보
	
	private int countPerPage; //페이지당 글 목록 수
	private int pagePerGroup; //그룹당 페이지 수
	private int currentPage; //현재 페이지 (최근 글이 1부터 시작)
	private int totalRecordsCount; //전체 글수
	private int totalPageCount; //전체 페이지수
	private int currentgroup; //전체 그룹(최근 그룹이 0부터 시작)
	private int startPageGroup; //현재 그룹의 첫 페이지
	private int endPageGroup; //현재 그룹의 마지막 페이지
	private int startRecord; //전체 레코드 중 현재 페이지 첫 글의 위치 (0부터 시작)
	
	
	public int getCountPerPage() {
		return countPerPage;
	}
	public int getPagePerGroup() {
		return pagePerGroup;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public int getTotalRecordsCount() {
		return totalRecordsCount;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public int getCurrentgroup() {
		return currentgroup;
	}
	public int getStartPageGroup() {
		return startPageGroup;
	}
	public int getEndPageGroup() {
		return endPageGroup;
	}
	public int getStartRecord() {
		return startRecord;
	}
	public void setCountPerPage(int countPerPage) {
		this.countPerPage = countPerPage;
	}
	public void setPagePerGroup(int pagePerGroup) {
		this.pagePerGroup = pagePerGroup;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public void setTotalRecordsCount(int totalRecordsCount) {
		this.totalRecordsCount = totalRecordsCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public void setCurrentgroup(int currentgroup) {
		this.currentgroup = currentgroup;
	}
	public void setStartPageGroup(int startPageGroup) {
		this.startPageGroup = startPageGroup;
	}
	public void setEndPageGroup(int endPageGroup) {
		this.endPageGroup = endPageGroup;
	}
	public void setStartRecord(int startRecord) {
		this.startRecord = startRecord;
	}
	
	
}
