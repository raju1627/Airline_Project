package com.jsp.airline.dto;

import com.jsp.airline.entity.BookingInformation;
import com.jsp.airline.entity.CheckIn;
import com.jsp.airline.entity.Passenger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PassengerDTO {

	private String emailId;
	private String firstName;
	private String lastName;
	private String gender;
	private String mobileNo;
	
	private  BookingInformation bookingInfo;
	
	private CheckIn checkin;
}
