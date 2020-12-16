package com.spring.lab6.controller.implementation;

import com.spring.lab6.domain.implementation.DataOfSensors;
import com.spring.lab6.service.GeneralServiceInterface;
import com.spring.lab6.service.implementation.DataOfSensorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dataOfSensors")
public class DataOfSensorsController extends GeneralController<DataOfSensors> {
    @Autowired
    DataOfSensorsService dataOfSensorsService;

    @Override
    public GeneralServiceInterface<DataOfSensors> getService() {
        return dataOfSensorsService;
    }
}
