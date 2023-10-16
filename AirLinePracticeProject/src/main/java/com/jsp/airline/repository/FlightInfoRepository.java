package com.jsp.airline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.airline.entity.FlightInfo;

public interface FlightInfoRepository extends JpaRepository<FlightInfo, Integer> {

}
