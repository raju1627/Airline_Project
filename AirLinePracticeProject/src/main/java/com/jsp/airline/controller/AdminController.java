package com.jsp.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.airline.dto.FlightDTO;
import com.jsp.airline.dto.PassengerDTO;
import com.jsp.airline.entity.Passenger;
import com.jsp.airline.serivice.AdminService;
@RestController
@RequestMapping("/api")
public class AdminController {

	@Autowired
	private AdminService admservice;	
	
	@PostMapping("/addflights")
	public ResponseEntity<String> addFlight(@RequestBody FlightDTO dto){
		int id = admservice.addFlights(dto);
		if(id!=0)
		{
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Airline Id :"+id);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		
	}
}
