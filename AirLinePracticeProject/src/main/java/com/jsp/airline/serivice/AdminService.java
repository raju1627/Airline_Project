package com.jsp.airline.serivice;

import com.jsp.airline.dto.FlightDTO;
import com.jsp.airline.dto.PassengerDTO;
import com.jsp.airline.entity.Passenger;

public interface AdminService {

	int addFlights(FlightDTO flightDto);
	
	void deleteAirlineById(int airlineId);
	
	
}
