package kr.co.jboard.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.jboard.dto.CommentDTO;
import kr.co.jboard.util.DBHelper;
import kr.co.jboard.util.SQL;

public class CommentDAO extends DBHelper {
	private static final CommentDAO INSTANCE = new CommentDAO();
	public static CommentDAO getInstance() {
		return INSTANCE;
	}
	private CommentDAO() {}
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void insertComment(CommentDTO dto) {
	
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_COMMENT);
			psmt.setInt(1, dto.getParent());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getWriter());
			psmt.setString(4, dto.getRegip());
			psmt.executeUpdate();
			closeAll();
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	public CommentDTO selectComment(int cno) {
		return null;
	}
	
	public List<CommentDTO> selectAllComment() {
		return null;
	}
	
	public void updateComment(CommentDTO dto) {
		
	}
	
	public void deleteComment(int cno) {
		
	}
}