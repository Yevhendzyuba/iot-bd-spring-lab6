package com.spring.lab6.controller.implementation;

import com.spring.lab6.domain.implementation.SensorData;
import com.spring.lab6.service.GeneralServiceInterface;
import com.spring.lab6.service.implementation.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sensorData")
public class SensorDataController extends GeneralController<SensorData> {

    @Autowired
    SensorDataService sensorDataService;

    @Override
    public GeneralServiceInterface<SensorData> getService() {
        return sensorDataService;
    }
}
