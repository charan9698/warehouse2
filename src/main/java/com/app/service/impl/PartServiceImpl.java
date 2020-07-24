package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Part;
import com.app.repo.PartRepository;
import com.app.service.IPartService;

@Service
public class PartServiceImpl implements IPartService {

	@Autowired
	private PartRepository repo;

	@Override
	@Transactional
	public Integer savePart(Part p) {
		return repo.save(p).getId();
	}

	@Override
	@Transactional
	public void updatePart(Part p) {
		repo.save(p);
	}

	@Override
	@Transactional
	public void deletePart(Integer id) {
		repo.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Part> getOnePart(Integer id) {
		return repo.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Part> getAllParts() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public boolean isPartExist(Integer id) {
		return repo.existsById(id);
	}

}
