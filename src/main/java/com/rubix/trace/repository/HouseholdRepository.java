package com.rubix.trace.repository;

import org.springframework.data.repository.CrudRepository;

import com.rubix.trace.Entities.Household;

public interface HouseholdRepository extends CrudRepository<Household, Integer> {
	Household findByName(String name);
}