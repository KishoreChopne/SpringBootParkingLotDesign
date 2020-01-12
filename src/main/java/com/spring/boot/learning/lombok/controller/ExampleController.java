package com.spring.boot.learning.lombok.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.learning.lombok.dto.MyIntroductionDTO;
import com.spring.boot.learning.lombok.dto.VehicleDTO;
import com.spring.boot.learning.lombok.service.ParkingLotService;

@RestController
@RequestMapping("/parkinglotApplication")
public class ExampleController {

	@Autowired
	ParkingLotService example;
	
	@GetMapping("/getVehicles")
	public List<VehicleDTO> getAllVehicle(){
		return example.getVehicleList();
	}

	@PostMapping("/parkVehicle")
	public String parkVehicle(VehicleDTO vehicle) {
		return example.park(vehicle);
	}
	
	@DeleteMapping("/unParkVehicle")
	public String unParkVehicle(long id) {
		return example.unParkVehicle(id);
	}

	@GetMapping("/hellopcf")
	public String Hello() {
		return "Hello PCF";
	}
	
	@GetMapping("/hellojenkins")
	public String helloJenkins() {
		return "Hello Jenkins";
	}
//
//	@PostMapping("/myInfo/{name}/{experiance}/{skills}")
//	public MyIntroductionDTO myInfo(@PathVariable String name, @PathVariable String experiance, @PathVariable String skills) {
//		return MyIntroductionDTO.builder().name(name).experiance(experiance).skills(skills).build();
//		
//	}
}
