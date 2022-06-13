/**
 * 
 */
package com.user.service.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.userservice.entity.Users;
import com.user.service.userservice.service.UserService;
import com.user.service.userservice.vo.ResponseTemplateVo;

/**
 * @author mpoli
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public Users saveUser(@RequestBody Users user)
	{
		return userService.saveUsers(user);
	}
	
	@GetMapping("/{userId}")
	public ResponseTemplateVo getUserWithDepartment(@PathVariable Long userId)
	{
		return userService.getUserWithDepartment(userId);
	}
}
