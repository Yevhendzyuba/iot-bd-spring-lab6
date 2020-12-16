package com.spring.lab6.controller.implementation;

import com.spring.lab6.domain.implementation.Location;
import com.spring.lab6.service.GeneralServiceInterface;
import com.spring.lab6.service.implementation.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("location")
public class LocationController extends GeneralController<Location> {
    @Autowired
    LocationService locationService;

    @Override
    public GeneralServiceInterface<Location> getService() {
        return locationService;
    }
}
