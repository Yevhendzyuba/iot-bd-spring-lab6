package com.spring.lab6.service.implementation;

import com.spring.lab6.domain.implementation.MaxWaterConsumption;
import com.spring.lab6.repository.MaxWaterConsumptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MaxWaterConsumptionService extends GeneralService<MaxWaterConsumption> {
    @Autowired
    MaxWaterConsumptionRepository maxWaterConsumptionRepository;

    @Override
    public JpaRepository<MaxWaterConsumption, Integer> getRepository() {
        return maxWaterConsumptionRepository;
    }
}
