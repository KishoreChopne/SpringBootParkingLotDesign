package com.spring.boot.learning.lombok.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.learning.lombok.dto.VehicleDTO;

@Repository
public interface ParkingRepository extends JpaRepository<VehicleDTO, Long>{

}
