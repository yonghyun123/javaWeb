package kr.or.connect.daoexam.dto;

import org.springframework.stereotype.Component;

public class Role {

	private int RoleId;
	private String description;
	
	public int getRoleId() {
		return RoleId;
	}
	public void setRoleId(int roleId) {
		RoleId = roleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Role [RoleId=" + RoleId + ", description=" + description + "]";
	}

}
