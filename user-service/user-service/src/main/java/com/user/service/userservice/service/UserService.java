/**
 * 
 */
package com.user.service.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.service.userservice.entity.Users;
import com.user.service.userservice.entity.Users;
import com.user.service.userservice.repository.UserRepository;
import com.user.service.userservice.vo.Department;
import com.user.service.userservice.vo.ResponseTemplateVo;

/**
 * @author mpoli
 *
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
    
	@Autowired

	private RestTemplate restTemplate;
	
	public Users saveUsers(Users user) {
	
		return userRepository.save(user);
	}

	public ResponseTemplateVo getUserWithDepartment(Long userId) {
		
		ResponseTemplateVo responseTemplateVo=new ResponseTemplateVo();
		Users user=userRepository.findByUserId(userId);
		
		Department department =restTemplate.getForObject("http://localhost:9001/departments/"+user.getDepartmentId(), Department.class);
		responseTemplateVo.setDepartment(department);
		responseTemplateVo.setUsers(user);
		return responseTemplateVo;
	}
}
