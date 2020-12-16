package com.spring.lab6.service.implementation;

import com.spring.lab6.domain.implementation.Noozle;
import com.spring.lab6.repository.NoozleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class NoozleService extends GeneralService<Noozle> {

    @Autowired
    NoozleRepository noozleRepository;

    @Override
    public JpaRepository<Noozle, Integer> getRepository() {
        return noozleRepository;
    }
}
