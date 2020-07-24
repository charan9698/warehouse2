package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.model.MachineType;

public interface IMachineTypeService {
	
	public Integer saveMachineType(MachineType mt);
	public void updateMachineType(MachineType mt);
	public void deleteMachineType(Integer id);
	public Optional<MachineType> getOneMachineType(Integer id);
	public List<MachineType> getAllMachineTypes();
	public boolean isMachineTypeExist(Integer id);

}
