package kr.or.connect.daoexam.dao;

public class RoleDaoSqls {
	public static final String SELECT_ALL = "SELECT * FROM role"; 
	public static final String UPDATE = "UPDATE role SET description = :description WHERE role_id = :roleId";
	public static final String SELECT_BY_ROLE_ID = "SELECT * FROM role WHERE role_id = :roleId";
	public static final String DELETE_BY_ROLE_ID = "DELETE FROM role WHERE role_id = :roleId";
}
