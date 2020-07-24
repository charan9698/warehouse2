package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.MachineType;
import com.app.repo.MachineTypeRepo;
import com.app.service.IMachineTypeService;

@Service
public class MachineTypeServiceImpl implements IMachineTypeService {

	@Autowired
	private MachineTypeRepo repo;

	@Override
	@Transactional
	public Integer saveMachineType(MachineType mt) {
		return repo.save(mt).getId();
	}

	@Override
	@Transactional
	public void updateMachineType(MachineType mt) {
		repo.save(mt);

	}

	@Override
	@Transactional
	public void deleteMachineType(Integer id) {
repo.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<MachineType> getOneMachineType(Integer id) {
		return repo.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<MachineType> getAllMachineTypes() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public boolean isMachineTypeExist(Integer id) {
		return repo.existsById(id);
	}

}
