package com.spring.lab6.repository;


import com.spring.lab6.domain.implementation.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDataRepository extends JpaRepository<SensorData, Integer> {
}
