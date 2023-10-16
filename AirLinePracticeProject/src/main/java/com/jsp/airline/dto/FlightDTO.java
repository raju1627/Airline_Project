package com.jsp.airline.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.jsp.airline.entity.Fare;
import com.jsp.airline.entity.Flight;
import com.jsp.airline.entity.FlightInfo;
import com.jsp.airline.entity.Inventory;

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

public class FlightDTO {

	private String destination;
	private String flightDate;
	private int flightNo;
	private String flightTime;
	private String currentLocation;
	
	private Fare fare;
	
	private FlightInfo flightInfo;
	
	private Inventory inventory;
	
	
}
