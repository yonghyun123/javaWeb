package kr.or.connect.rollat.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import kr.or.connect.rollat.dto.Role;

public class RoleDao {
	 	private NamedParameterJdbcTemplate jdbc;
	    private SimpleJdbcInsert insertAction;
	    private RowMapper<Role> rowMapper = BeanPropertyRowMapper.newInstance(Role.class);
	    
	    public List<Role> selectAll(){		
    		return jdbc.query("SELECT * FROM role", rowMapper);
	    }
}
