package com.jsp.airline.serivice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.airline.dto.FlightDTO;
import com.jsp.airline.dto.PassengerDTO;
import com.jsp.airline.entity.AirlineInformation;
import com.jsp.airline.entity.BookingInformation;
import com.jsp.airline.entity.CheckIn;
import com.jsp.airline.entity.Fare;
import com.jsp.airline.entity.Flight;
import com.jsp.airline.entity.FlightInfo;
import com.jsp.airline.entity.Inventory;
import com.jsp.airline.entity.Passenger;
import com.jsp.airline.repository.AirlineInfoRepository;
import com.jsp.airline.repository.FlightInfoRepository;
import com.jsp.airline.repository.FlightRepository;
import com.jsp.airline.repository.PassengerRepository;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private AirlineInfoRepository airRepo;
	
	@Autowired
	private FlightInfoRepository flightinfoRepo;
	
	@Override
	public int addFlights(FlightDTO flightDto) {
		Flight flights=flightRepo.save(Flight.builder()
				.flightNo(flightDto.getFlightNo())
				.flightDate(flightDto.getFlightDate())
				.flightTime(flightDto.getFlightTime())
				.currentLocation(flightDto.getCurrentLocation())
				.destination(flightDto.getDestination())
				     .fare(Fare.builder()
				    		 .amount(flightDto.getFare().getAmount())
				    		 .currency(flightDto.getFare().getCurrency())
				    		 .build())
				     .flightInfo(FlightInfo.builder()
				    		 .flightNo(flightDto.getFlightInfo().getFlightNo())
				    		 .flightType(flightDto.getFlightInfo().getFlightType())
				    		 .airinfo(AirlineInformation.builder().airlineName(flightDto.getFlightInfo().getAirinfo().getAirlineName()).build())
				    		 .build())
				     .inventory(Inventory.builder()
				    		 .count(flightDto.getInventory().getCount())
				    		 .build())
			                           	.build());
		return flights.getFlightId();
	}

	@Override
	public void deleteAirlineById(int airlineId) {
		airRepo.deleteById(airlineId);	
	}
	
}
