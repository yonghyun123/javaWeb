package kr.or.connect.daoexam.dao;


import static kr.or.connect.daoexam.dao.RoleDaoSqls.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.daoexam.dto.Role;

@Repository
public class RoleDao {
	
	private NamedParameterJdbcTemplate jdbc;
	private RowMapper<Role> rowMapper = BeanPropertyRowMapper.newInstance(Role.class);
	private SimpleJdbcInsert insertAction;
	
	public RoleDao(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource).withTableName("role");
	}
	
	public List<Role> selectAll(){
		return jdbc.query(SELECT_ALL, Collections.emptyMap(), rowMapper);
	}
	public int insert(Role role){
		SqlParameterSource params = new BeanPropertySqlParameterSource(role);
		return insertAction.execute(params);
	}
	
	public int update(Role role){
		SqlParameterSource param = new BeanPropertySqlParameterSource(role);
		return jdbc.update(UPDATE, param);
	}
	
	public int deleteById(int id){
		Map<String,?> param = Collections.singletonMap("roleId", id);
		return jdbc.update(DELETE_BY_ROLE_ID, param);
	}
	
	public Role selectById(int id){
		try{
			Map<String, ?> param = Collections.singletonMap("roleId", id);
			return jdbc.queryForObject(SELECT_BY_ROLE_ID, param, rowMapper);
	
		}catch(EmptyResultDataAccessException e){
			return null;
		}
	}
}
