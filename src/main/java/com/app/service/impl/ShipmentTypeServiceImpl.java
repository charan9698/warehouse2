package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.ShipmentType;
import com.app.repo.ShipmentTypeRepository;
import com.app.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private ShipmentTypeRepository repo;


	@Override
	@Transactional
	public Integer saveShipmentType(ShipmentType st) {
		return repo.save(st).getId();
	}

	@Override
	@Transactional
	public void updateShipmentType(ShipmentType st) {
		repo.save(st);
	}

	@Override
	@Transactional
	public void deleteShipmentType(Integer id) {
		repo.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<ShipmentType> getOneShipmentType(Integer id) {
		return repo.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ShipmentType> getAllShipmentTypes() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public boolean isShipmentTypeExist(Integer id) {
		return repo.existsById(id);
	}

}
