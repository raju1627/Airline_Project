package com.jsp.airline.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

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
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	private String destination;
	private String flightDate;
	private int flightNo;
	private String flightTime;
	private String currentLocation;
	
	@OneToOne
	(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="fareId")
	private Fare fare;
	
	@JoinColumn(name="flightInfo_id")
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private FlightInfo flightInfo;
	
	@JoinColumn(name="inventory_Id")
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Inventory inventory;
	
}
