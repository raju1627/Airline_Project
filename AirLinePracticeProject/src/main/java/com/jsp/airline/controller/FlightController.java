package com.jsp.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.airline.dto.FlightDTO;
import com.jsp.airline.serivice.FlightService;

@RestController
@RequestMapping("/api")
public class FlightController {

	@Autowired
	private FlightService flightService;
	
	@GetMapping("serchFlight/{loc}/{dest}/{date}/{time}/{no}")
	public ResponseEntity<FlightDTO> searchFlight(@PathVariable("loc") String location,@PathVariable("dest")String destination,@PathVariable("date")String date,@PathVariable("time")String flightTime,@PathVariable("no")int flightNo)
	{
		FlightDTO flight=flightService.searchFlight(location, destination, date, flightTime, flightNo);
		if(flight!=null)
		{
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(flight);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
	}
}
