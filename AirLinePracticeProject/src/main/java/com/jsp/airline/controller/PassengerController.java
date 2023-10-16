package com.jsp.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.airline.dto.PassengerDTO;
import com.jsp.airline.serivice.PassengerService;
@RestController
@RequestMapping("/api")
public class PassengerController {

	@Autowired
	private PassengerService passService;
	
	@PostMapping("/addPassenger")
	public ResponseEntity<String> addPassengers(@RequestBody PassengerDTO dto)
	{
		int id2 = passService.addPassenger(dto);
		if(id2!=0)
		{
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Passenger Id :"+id2);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		
	}
}
