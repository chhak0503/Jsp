package dao;

import java.util.List;

import dto.User1DTO;
import util.DBHelper;

public class User1DAO extends DBHelper {
	
	// 싱글톤
	private static final User1DAO INSTANCE = new User1DAO();
	public static User1DAO getInstance() {
		return INSTANCE;
	}
	private User1DAO() {}	
	
	// 기본 CRUD
	public void insertUser1(User1DTO dto) {
		
		try {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public User1DTO selectUser1(String uid) {
		
		try {
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public List<User1DTO> selectUser1All() {
		
		try {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void updateUser1(User1DTO dto) {
		try {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser1(String uid) {
		try {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}




