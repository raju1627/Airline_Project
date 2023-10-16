package com.jsp.airline.serivice;

import com.jsp.airline.dto.FlightDTO;
import com.jsp.airline.entity.Flight;

public interface FlightService {

	FlightDTO searchFlight(String location,String destination,String date,String flightTime,int flightNo);
}
