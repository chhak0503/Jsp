package dao.shop;

import java.util.List;

import dto.shop.CustomerDTO;

public class CustomerDAO {
	
	private static final CustomerDAO INSTANCE = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return INSTANCE;
	}	
	private CustomerDAO() {}
	
	
	public void insertCustomer(CustomerDTO dto) {
		
	}
	
	public CustomerDTO selectCustomer(String cid) {
		return null;
	}
	
	public List<CustomerDTO> selectAllCustomer() {
		return null;
	}
	
	public void updateCustomer(CustomerDTO dto) {
		
	}
	
	public void deleteCustomer(String cid) {
		
	}
}
