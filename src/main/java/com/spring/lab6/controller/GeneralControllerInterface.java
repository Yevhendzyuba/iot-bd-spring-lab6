package com.spring.lab6.controller;

import com.spring.lab6.service.GeneralServiceInterface;

import java.util.List;

public interface GeneralControllerInterface<T> {
    GeneralServiceInterface<T> getService();
    List<T> findAll();
    T findById(Integer id);
    void create(T t);
    void update(Integer id, T t);
    void delete(Integer id);
}
