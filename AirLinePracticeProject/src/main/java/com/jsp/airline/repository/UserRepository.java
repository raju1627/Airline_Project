package com.jsp.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.airline.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT e1 FROM User e1 WHERE e1.userName= :userName AND e1.password= :password")
	User LoginUser(@Param("userName") String userName,@Param("password") String password);
}
