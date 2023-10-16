package com.jsp.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.airline.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	@Query("SELECT f1 FROM Flight f1 WHERE f1.destination= :destination AND f1.currentLocation= :location AND f1.flightDate= :date AND f1.flightTime= :flightTime AND f1.flightNo= :flightNo")
	Flight serachFlight(@Param("location") String location,@Param("destination")String destinaion, @Param("date")String date,@Param("flightTime")String flightTime,@Param("flightNo")int fligthNo);
}
