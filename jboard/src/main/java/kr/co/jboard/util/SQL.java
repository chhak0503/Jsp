package kr.co.jboard.util;

public class SQL {

	// terms
	public static final String SELECT_TERMS = "select * from `terms` where `no`=?";
	
	// user
	public static final String SELECT_COUNT_UID = "select COUNT(*) from `user` where `uid`=?";
	public static final String SELECT_COUNT_NICK = "select COUNT(*) from `user` where `nick`=?";
	public static final String SELECT_COUNT_EMAIL = "select COUNT(*) from `user` where `email`=?";
	public static final String SELECT_COUNT_HP = "select COUNT(*) from `user` where `hp`=?";
	
	public static final String SELECT_USER = "select * from `user` where `uid`=? and `pass`=SHA2(?, 256)";
	public static final String INSERT_USER = "insert into `user` set "
											+ "`uid`=?,"
											+ "`pass`=SHA2(?, 256),"
											+ "`name`=?,"
											+ "`nick`=?,"
											+ "`email`=?,"
											+ "`hp`=?,"
											+ "`zip`=?,"
											+ "`addr1`=?,"
											+ "`addr2`=?,"
											+ "`regip`=?,"
											+ "`regDate`=NOW()";

}
