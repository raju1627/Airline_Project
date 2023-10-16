package com.jsp.airline.dto;

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
public class CheckinDTO {

	private String seatNo;
	private String gateNo;
	
	private Passenger passenger;
}
