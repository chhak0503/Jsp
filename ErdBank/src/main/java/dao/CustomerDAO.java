package dao;

import java.util.List;

import dto.AccountDTO;
import dto.CustomerDTO;
import util.DBHelper;

public class CustomerDAO extends DBHelper {
	private static final CustomerDAO INSTANCE = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return INSTANCE;
	}
	private CustomerDAO() {}
	
	public void insert(CustomerDTO dto) {}
	public CustomerDTO select(String c_no) {
		return null;
	}
	public List<CustomerDTO> selectAll() {
		return null;
	}
	public void update(CustomerDTO dto) {}
	public void delete(String c_no) {}
}
