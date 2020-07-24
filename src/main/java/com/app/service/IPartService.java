package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.model.Part;

public interface IPartService {
	
	public Integer savePart(Part p);
	public void updatePart(Part p);
	public void deletePart(Integer id);
	public Optional<Part> getOnePart(Integer id);
	public List<Part> getAllParts();
	public boolean isPartExist(Integer id);

}
