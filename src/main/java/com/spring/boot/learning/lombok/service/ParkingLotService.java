package com.spring.boot.learning.lombok.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.learning.lombok.dto.VehicleDTO;
import com.spring.boot.learning.lombok.repo.ParkingRepository;

@Service
public class ParkingLotService implements ParkingLotContract{
	
	@Autowired
	ParkingRepository parkingRepo;
	
	public String Hello() {
		return "Hello World";
	}

	@Override
	public List<VehicleDTO> getVehicleList() {
		// TODO Auto-generated method stub
		return parkingRepo.findAll();
	}

	@Override
	public String park(VehicleDTO vehicle) {
		List<VehicleDTO> listofvehicles = parkingRepo.findAll();
		
		long id = vehicle.getId();
		
		if(id > 0 && id <= 20) {
			for(VehicleDTO dto : listofvehicles) {
				long vehiclesParkedId = dto.getId();
				if (vehiclesParkedId == id) {
					throw new RuntimeException("Parking slot not available");
				}
			}
			
			parkingRepo.save(vehicle);			
		}
		else {
			throw new RuntimeException("Please provide parking slot id between 1 and 20");
		}
		
		return "Parked";
	}

	@Override
	public String unParkVehicle(Long id) {
		// TODO Auto-generated method stub
		parkingRepo.deleteById(id);
		return "Unparked";
	}
}
