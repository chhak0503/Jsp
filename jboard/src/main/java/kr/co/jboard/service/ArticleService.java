package kr.co.jboard.service;

import java.util.List;

import kr.co.jboard.dao.ArticleDAO;
import kr.co.jboard.dto.ArticleDTO;

public enum ArticleService {
	
	INSTANCE;
	private ArticleDAO dao = ArticleDAO.getInstance();
	
	public int registeArticle(ArticleDTO dto) {
		return dao.insertArticle(dto);
	}
	
	public ArticleDTO findArticle(int no) {
		return dao.selectArticle(no);
	}
	
	public int getCountArticle() {
		return dao.selectCountArticle();
	}
	
	public List<ArticleDTO> findAllArticle(int start) {
		return dao.selectAllArticle(start);
	}
	
	public void modifyArticle(ArticleDTO dto) {
		dao.updateArticle(dto);
	}
	
	public void deleteArticle(int no) {
		dao.deleteArticle(no);
	}
	
	// 마지막 페이지 번호 계산
	public int getLastPageNum(int total) {
		
		int lastPageNum = 0;
		
		if(total % 10 == 0) {
			lastPageNum = total / 10;
		}else {
			lastPageNum = total / 10 + 1;	
		}
		return lastPageNum;
	}
	
	// 현재 페이지 번호 구하기 
	public int getCurrentPage(String pg) {
		
		int currentPage = 1; 
		
		if(pg != null) {
			currentPage = Integer.parseInt(pg);
		}
		return currentPage;
	}
	
	// 페이지 시작번호 구하기(LIMIT 용)
	public int getStartNum(int currentPage) {
		return (currentPage - 1) * 10;
	}
	
	
}













