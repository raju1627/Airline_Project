package com.jsp.airline.serivice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.airline.dto.FlightDTO;
import com.jsp.airline.entity.Flight;
import com.jsp.airline.repository.FlightInfoRepository;
import com.jsp.airline.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightRepository flightRepo;
	
	
	@Override
	public FlightDTO searchFlight(String location, String destination, String date, String flightTime, int flightNo) {
	    Flight flight=flightRepo.serachFlight(location, destination, date, flightTime, flightNo);
		if(flight!=null)
		{
			return FlightDTO.builder()
					.currentLocation(location)
                    .destination(destination)
                    .flightDate(null)
					.build();
		}
		else
		{
			return null;
		}
	}

}
