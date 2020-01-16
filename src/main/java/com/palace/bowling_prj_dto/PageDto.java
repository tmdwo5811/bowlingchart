package com.palace.bowling_prj_dto;

public class PageDto {
	
	//페이지 관련 정보
	
	private int countPerPage; //페이지당 글 목록 수
	private int pagePerGroup; //그룹당 페이지 수
	private int currentPage; //현재 페이지 (최근 글이 1부터 시작)
	private int totalRecordsCount; //전체 글수
	private int totalPageCount; //전체 페이지수
	private int currentGroup; //전체 그룹(최근 그룹이 0부터 시작)
	private int startPageGroup; //현재 그룹의 첫 페이지 **
	private int endPageGroup; //현재 그룹의 마지막 페이지 **
	private int startRecord; //전체 레코드 중 현재 페이지 첫 글의 위치 (0부터 시작) **
	
	/*
	 * 생성자
	 * */
	
	public PageDto(int countPerPage, int pagePerGroup, int currentPage, int totalRecordsCount) {
		//페이지당 글 수, 그룹당 페이지수, 현재 페이지, 전체 글 수를 전달 받음
		this.countPerPage = countPerPage;
		this.pagePerGroup = pagePerGroup;
		this.totalRecordsCount = totalRecordsCount;
		
		//전체 페이지 수
		totalPageCount = (totalRecordsCount + countPerPage -1) / countPerPage;
		
		//전달된 현재 페이지가 1보다 작으면 현재페이지를 1페이지로 지정
		if (currentPage < 1) currentPage = 1;
		//전달된 현재 페이지가 마지막 페이지보다 크면 현재페이지를 마지막 페이지로 지정
		if (currentPage > totalPageCount) currentPage = totalPageCount;
		
		this.currentPage = currentPage;
		
		//현재 그룹
		currentGroup = (currentPage -1 ) / pagePerGroup;
		
		//현재 그룹의 첫 페이지
		startPageGroup = currentGroup * pagePerGroup + 1;
		
		//현재 그룹의 첫 페이지가 1보다 작으면 1로 처리
		startPageGroup = startPageGroup < 1 ? 1 : startPageGroup;
		
		//현재 그룹의 마지막 페이지 1+10-1
		endPageGroup = startPageGroup + pagePerGroup - 1;
		
		//현재 그룹의 마지막 페이지가 전체 페이지 수보다 작으면 전체 페이지 수를 마지막으로
		endPageGroup = endPageGroup < totalPageCount ? endPageGroup : totalPageCount;
	}
	
	
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
		return currentGroup;
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
		this.currentGroup = currentgroup;
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
