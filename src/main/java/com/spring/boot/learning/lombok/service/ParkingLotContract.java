package com.spring.boot.learning.lombok.service;

import java.util.List;

import com.spring.boot.learning.lombok.dto.VehicleDTO;

public interface ParkingLotContract {
	List<VehicleDTO> getVehicleList(); 
	String park(VehicleDTO vehicle); 
	String unParkVehicle(Long id);
}
