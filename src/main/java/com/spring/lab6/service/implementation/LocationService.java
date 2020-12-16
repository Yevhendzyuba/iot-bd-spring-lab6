package com.spring.lab6.service.implementation;

import com.spring.lab6.domain.implementation.Location;
import com.spring.lab6.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationService extends GeneralService<Location> {
    @Autowired
    LocationRepository locationRepository;

    @Override
    public JpaRepository<Location, Integer> getRepository() {
        return locationRepository;
    }
}
