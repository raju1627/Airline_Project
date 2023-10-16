package com.jsp.airline.dto;

import com.jsp.airline.entity.Fare;
import com.jsp.airline.entity.Flight;

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
public class FareDTO {

	private double amount;
	private String currency;
	
	private Flight flight;
}
