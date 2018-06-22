package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class JDBCexam2 {
	public static void main(String[] args){
		int roleId = 500;
		String description = "CTO";
		
		RoleDao roleDao = new RoleDao();
		Role role = new Role(roleId, description);
		
		int innerCount = roleDao.addRole(role);
		System.out.println(innerCount);
		
	}
}
