package com.rubix.trace.repository;

import org.springframework.data.repository.CrudRepository;

import com.rubix.trace.Entities.Event;

public interface EventRepository extends CrudRepository<Event, Integer> {
	Event findByName(String name);
}