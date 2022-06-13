/**
 * 
 */
package com.user.service.userservice.vo;

import com.user.service.userservice.entity.Users;

/**
 * @author mpoli
 *
 */
public class ResponseTemplateVo {

	private Users users;
	private Department department;
	
	
	
	public ResponseTemplateVo() {
		super();
	}
	public ResponseTemplateVo(Users user, Department department) {
		super();
		this.users = users;
		this.department = department;
	}
	/**
	 * @return the user
	 */
	public Users getUsers() {
		return users;
	}
	/**
	 * @param user the user to set
	 */
	public void setUsers(Users user) {
		this.users = user;
	}
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
