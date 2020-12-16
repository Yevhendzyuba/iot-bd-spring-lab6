package com.spring.lab6.repository;

import com.spring.lab6.domain.implementation.MaxWaterConsumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaxWaterConsumptionRepository extends JpaRepository<MaxWaterConsumption, Integer> {
}
