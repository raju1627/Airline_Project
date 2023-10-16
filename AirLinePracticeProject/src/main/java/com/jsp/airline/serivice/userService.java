package com.jsp.airline.serivice;

import com.jsp.airline.dto.UserDTO;

public interface userService {

	int registerUser(UserDTO dto);
	
	String userLogin(String userName,String password);
}
