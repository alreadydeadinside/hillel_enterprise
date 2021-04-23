
package com.example.demo.repository;

import com.example.demo.model.OldUser;

import java.util.List;

public interface AbstractRepository<T> {

    List<T> getAll();

   void create(OldUser user);
}