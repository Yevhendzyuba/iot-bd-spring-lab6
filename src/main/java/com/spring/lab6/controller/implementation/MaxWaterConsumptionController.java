package com.spring.lab6.controller.implementation;

import com.spring.lab6.domain.implementation.MaxWaterConsumption;
import com.spring.lab6.service.GeneralServiceInterface;
import com.spring.lab6.service.implementation.MaxWaterConsumptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("maxWaterConsumption")
public class MaxWaterConsumptionController extends GeneralController<MaxWaterConsumption> {

    @Autowired
    MaxWaterConsumptionService maxWaterConsumptionService;

    @Override
    public GeneralServiceInterface<MaxWaterConsumption> getService() {
        return maxWaterConsumptionService;
    }
}
