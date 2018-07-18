package kr.or.connect.daoexam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.ApplicationConfig;
import kr.or.connect.daoexam.dao.RoleDao;
import kr.or.connect.daoexam.dto.Role;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		RoleDao roleDao = ac.getBean(RoleDao.class);
		
		Role newRole = new Role();
		newRole.setDescription("programmer");
		newRole.setRoleId(102);
		
//		int count = roleDao.insert(newRole);
//		System.out.println(count+"건 입력하였습니다");
		
		int count = roleDao.update(newRole);
		System.out.println(count+"건 변경하였습니다");
		
		Role selectRole = roleDao.selectById(102);
		System.out.println(selectRole);
		
		System.out.println(roleDao.deleteById(500)+"건 삭제되었습니다");
		
		System.out.println(roleDao.selectById(500));
		
	}

}
