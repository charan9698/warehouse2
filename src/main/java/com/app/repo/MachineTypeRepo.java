package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.MachineType;

public interface MachineTypeRepo extends JpaRepository<MachineType, Integer> {

}
