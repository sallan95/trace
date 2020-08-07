package com.rubix.trace.repository;

import org.springframework.data.repository.CrudRepository;

import com.rubix.trace.Entities.People;

public interface PeopleRepository extends CrudRepository<People, Integer> {
	People findByName(String name);
}