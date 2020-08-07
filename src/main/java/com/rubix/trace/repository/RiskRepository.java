package com.rubix.trace.repository;

import org.springframework.data.repository.CrudRepository;

import com.rubix.trace.Entities.Risk;

public interface RiskRepository extends CrudRepository<Risk, Integer> {
    Risk findByName(String name);
}