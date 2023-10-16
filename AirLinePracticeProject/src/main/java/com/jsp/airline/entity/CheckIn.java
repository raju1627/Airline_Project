package com.jsp.airline.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class CheckIn {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int checkinId;
	private String seatNo;
	private String gateNo;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "checkin")
	private Passenger passenger;
}
