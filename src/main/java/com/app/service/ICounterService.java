package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.model.Counter;

public interface ICounterService {

	public Integer saveCounter(Counter c);
	public void updateCounter(Counter c);
	public void deleteCounter(Integer id);
	public Optional<Counter> getOneCounter(Integer id);
	public List<Counter> getAllCounters();
	public boolean isCounterExist(Integer id);
	
}
