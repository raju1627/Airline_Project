package com.jsp.airline.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table
public class BookingInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookigId;
	private LocalDate bookingDate;
	private String destination;
	private double fare;
	private LocalDate flightDate;
	private int flightNo;
	private String status;
	private LocalTime flightTime;
	private String currentCity;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "bookingInfo")
	private Passenger passenger;
}
