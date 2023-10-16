package com.jsp.airline.dto;

import com.jsp.airline.entity.AirlineInformation;
import com.jsp.airline.entity.Flight;
import com.jsp.airline.entity.FlightInfo;

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

public class FlightInfoDTO {

	private int flightNo;
	private String flightType;
	
	private AirlineInformation airinfo;
	
	private Flight flight;
}
