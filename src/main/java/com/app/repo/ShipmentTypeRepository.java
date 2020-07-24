package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.ShipmentType;

public interface ShipmentTypeRepository extends JpaRepository<ShipmentType, Integer> {

}
