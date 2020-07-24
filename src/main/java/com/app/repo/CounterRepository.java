package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Counter;

public interface CounterRepository extends JpaRepository<Counter, Integer> {

}
