package jboard.util;

public class Sql {
	
	
	
	// terms
	public static final String SELECT_TERMS = "SELECT * FROM TB_TERMS where NO=?";
	
	// user
	public static final String INSERT_USER = "INSERT INTO TB_USER (USID, PASS, US_NAME, NICK, EMAIL, HP, ZIP, ADDR1, ADDR2, REG_IP, REG_DATE) "
											+ "VALUES (?,?,?,?,?,?,?,?,?,?,SYSDATE)";

}
