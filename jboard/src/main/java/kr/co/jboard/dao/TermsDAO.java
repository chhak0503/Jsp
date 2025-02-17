package kr.co.jboard.dao;

import java.util.List;

import kr.co.jboard.dto.TermsDTO;
import kr.co.jboard.util.DBHelper;

public class TermsDAO extends DBHelper {
	private static final TermsDAO INSTANCE = new TermsDAO();
	public static TermsDAO getInstance() {
		return INSTANCE;
	}
	private TermsDAO() {}
	
	public void insertTerms(TermsDTO dto) {
		
	}
	
	public TermsDTO selectTerms(int no) {
		return null;
	}
	
	public List<TermsDTO> selectAllTerms() {
		return null;
	}
	
	public void updateTerms(TermsDTO dto) {
		
	}
	
	public void deleteTerms(int no) {
		
	}
}