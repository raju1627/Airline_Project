package com.jsp.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.airline.dto.UserDTO;
import com.jsp.airline.serivice.userService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private userService userService;
	
	@PostMapping("/userRegister")
	public ResponseEntity<String> userRegister( @RequestBody UserDTO dto)
	{
		int id = userService.registerUser(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Id is:"+id);
		
	}
	@GetMapping("LoginUser/{name}/{password}")
	public ResponseEntity<String> LoginUSer(@PathVariable("name") String userName,@PathVariable("password") String password)
	{
		String user=userService.userLogin(userName, password);
		if(user !=null)
		{
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Login Successful");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
}
