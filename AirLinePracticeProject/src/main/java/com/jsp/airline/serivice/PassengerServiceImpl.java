package com.jsp.airline.serivice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.airline.dto.PassengerDTO;
import com.jsp.airline.entity.BookingInformation;
import com.jsp.airline.entity.CheckIn;
import com.jsp.airline.entity.Passenger;
import com.jsp.airline.repository.PassengerRepository;
@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository passRepo;
	
	@Override
	public int addPassenger(PassengerDTO passDto) {
		Passenger passenger=passRepo.save(Passenger.builder()
			       .emailId(passDto.getEmailId())
			       .firstName(passDto.getFirstName())
			       .lastName(passDto.getLastName())
			       .gender(passDto.getGender())
			       .mobileNo(passDto.getMobileNo())
			            .checkin(CheckIn.builder()
			            		.seatNo(passDto.getCheckin().getSeatNo())
			            		.gateNo(passDto.getCheckin().getGateNo())
			            		.build())
			            .bookingInfo(BookingInformation.builder()
			            		.bookingDate(passDto.getBookingInfo().getBookingDate())
			            		.destination(passDto.getBookingInfo().getDestination())
			            		.fare(passDto.getBookingInfo().getFare())
			            		.flightDate(passDto.getBookingInfo().getFlightDate())
			            		.flightNo(passDto.getBookingInfo().getFlightNo())
			            		.flightTime(passDto.getBookingInfo().getFlightTime())
			            		.status(passDto.getBookingInfo().getStatus())
			            		.currentCity(passDto.getBookingInfo().getCurrentCity())
			            		.build())
			                              .build());
	return passenger.getPassengerId();
	}

}
