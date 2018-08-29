package kr.or.connect.rollat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;
import kr.or.connect.rollat.dao.RoleDao;
import kr.or.connect.rollat.dto.Role;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleDaoTest {
	@Autowired
	RoleDao roleDao;
	
	@Test
	public void selectAll() throws Exception{
		List<Role> roles = roleDao.selectAll();
		if(roles != null){
			System.out.println("dao sucessssssssssssss");
		}
	}
}
