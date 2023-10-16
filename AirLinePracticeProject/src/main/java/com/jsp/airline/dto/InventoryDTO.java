package com.jsp.airline.dto;

import java.util.List;

import com.jsp.airline.entity.Flight;
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
public class InventoryDTO {

	private int count;
	
	List<Flight> flight;
}
