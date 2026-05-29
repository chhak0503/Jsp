package dao;

import java.util.List;

import dto.User1DTO;

// DAO(Data Access Object) : 데이터베이스와 상호작용(SQL 처리)하는 MVC 컴포넌트 
public class User1DAO {
	
	// 싱글톤
	private static User1DAO instance = new User1DAO();
	public static User1DAO getInstance() {
		return instance;
	}
	private User1DAO() {}
	
	
	// 기본 CRUD 메서드
	public void insert(User1DTO dto) {
		
	}
	
	public User1DTO select(String userid) {
		return null;		
	}
	
	public List<User1DTO> selectAll() {
		return null;
	}
	
	public void update(User1DTO dto) {
		
	}
	
	public void delete(String userid) {
		
	}
	
}
