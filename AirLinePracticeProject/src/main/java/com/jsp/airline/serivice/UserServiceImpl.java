package com.jsp.airline.serivice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.airline.dto.UserDTO;
import com.jsp.airline.entity.User;
import com.jsp.airline.repository.UserRepository;
@Service
public class UserServiceImpl implements userService {

	@Autowired
	UserRepository userRepo;
	@Override
	public int registerUser(UserDTO dto) {
		User user=User.builder()
				.firstName(dto.getFirstName())
				.lastName(dto.getLastName())
				.mobileNo(dto.getMobileNo())
				.gender(dto.getGender())
				.userName(dto.getUserName())
				.password(dto.getPassword())
				.build();
		return userRepo.save(user).getUserId();
	}
	@Override
	public String userLogin(String userName, String password) {
		User user=userRepo.LoginUser(userName, password);
		if(user !=null)
		{
			return "login successful";
		}
		else
		{
			return null;
		}
	}

}