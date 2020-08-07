package com.rubix.trace.repository;

import org.springframework.data.repository.CrudRepository;

import com.rubix.trace.Entities.Interaction;

public interface InteractionRepository extends CrudRepository<Interaction, Integer> {

}