package com.spring.lab6.service.implementation;

import com.spring.lab6.domain.implementation.SensorData;
import com.spring.lab6.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class SensorDataService extends GeneralService<SensorData> {

    @Autowired
    SensorDataRepository sensorDataRepository;

    @Override
    public JpaRepository<SensorData, Integer> getRepository() {
        return sensorDataRepository;
    }
}
