package kr.or.connect.jdbcexam;

import java.util.ArrayList;
import java.util.List;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class JDBCexam3 {
	public static void main(String[] args){
		RoleDao roleDao = new RoleDao();
		List<Role> list = roleDao.getRoles();
		List<String> list2 = null;
		list2.add("gagaga");
		
		System.out.println(list2.get(0));
		for(Role item : list){
			System.out.println(item);
		}
	}
}
