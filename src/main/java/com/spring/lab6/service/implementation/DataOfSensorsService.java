package com.spring.lab6.service.implementation;

import com.spring.lab6.domain.implementation.DataOfSensors;
import com.spring.lab6.repository.DataOfSensorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DataOfSensorsService extends GeneralService<DataOfSensors> {
    @Autowired
    DataOfSensorsRepository dataOfSensorsRepository;

    @Override
    public JpaRepository<DataOfSensors, Integer> getRepository() {
        return dataOfSensorsRepository;
    }
}
