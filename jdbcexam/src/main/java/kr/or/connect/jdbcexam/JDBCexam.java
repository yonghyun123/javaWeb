package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class JDBCexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoleDao roleDao = new RoleDao();
		
		Role role = roleDao.getRole(100);
		System.out.println(role);
	}

}
