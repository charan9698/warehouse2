package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.model.ShipmentType;

public interface IShipmentTypeService {
	
	public Integer saveShipmentType(ShipmentType st);
	public void updateShipmentType(ShipmentType st);
	public void deleteShipmentType(Integer id);
	public Optional<ShipmentType> getOneShipmentType(Integer id);
	public List<ShipmentType> getAllShipmentTypes();
	public boolean isShipmentTypeExist(Integer id);

}
