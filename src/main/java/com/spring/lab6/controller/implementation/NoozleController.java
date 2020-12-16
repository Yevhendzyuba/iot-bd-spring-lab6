package com.spring.lab6.controller.implementation;

import com.spring.lab6.domain.implementation.Noozle;
import com.spring.lab6.service.GeneralServiceInterface;
import com.spring.lab6.service.implementation.NoozleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("noozle")
public class NoozleController extends GeneralController<Noozle> {

    @Autowired
    NoozleService noozleService;

    @Override
    public GeneralServiceInterface<Noozle> getService() {
        return noozleService;
    }
}
