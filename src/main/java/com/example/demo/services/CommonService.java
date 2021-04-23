package com.example.demo.services;

import com.example.demo.entity.AbstractEntity;

import java.util.Optional;

public interface CommonService<E extends AbstractEntity> {
    Optional<E> save(E entity);
}