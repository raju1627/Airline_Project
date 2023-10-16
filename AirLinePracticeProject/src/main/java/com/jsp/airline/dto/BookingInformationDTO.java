package com.jsp.airline.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.jsp.airline.entity.BookingInformation;
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
public class BookingInformationDTO {

	private LocalDate bookingDate;
	private String destination;
	private double fare;
	private LocalDate flightDate;
	private int flightNo;
	private String status;
	private LocalTime flightTime;
	private String currentCity;
	
	private Passenger passenger;
}
