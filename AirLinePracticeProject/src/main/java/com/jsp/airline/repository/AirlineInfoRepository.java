package com.jsp.airline.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.airline.entity.AirlineInformation;

public interface AirlineInfoRepository extends JpaRepository<AirlineInformation, Integer> {

}
