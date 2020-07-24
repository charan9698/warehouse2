package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Counter;
import com.app.repo.CounterRepository;
import com.app.service.ICounterService;

@Service
public class CounterServiceImpl implements ICounterService {

	@Autowired
	private CounterRepository repo;

	@Override
	@Transactional
	public Integer saveCounter(Counter c) {
		return repo.save(c).getId();
	}

	@Override
	@Transactional
	public void updateCounter(Counter c) {
		repo.save(c);
	}

	@Override
	@Transactional
	public void deleteCounter(Integer id) {
		repo.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Counter> getOneCounter(Integer id) {
		return repo.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Counter> getAllCounters() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public boolean isCounterExist(Integer id) {
		return repo.existsById(id);
	}

}
