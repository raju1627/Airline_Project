package com.jsp.airline.dto;

import java.util.List;

import com.jsp.airline.entity.AirlineInformation;
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
public class AirlineInformationDto {

	private String airlineName;
	
	List<FlightInfo> flightInfo;
}
