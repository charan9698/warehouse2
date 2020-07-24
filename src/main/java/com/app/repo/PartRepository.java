package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Part;

public interface PartRepository extends JpaRepository<Part, Integer> {

}
