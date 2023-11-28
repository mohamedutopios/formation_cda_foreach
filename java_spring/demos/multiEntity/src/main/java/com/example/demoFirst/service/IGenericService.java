package com.example.demoFirst.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T,ID> {

    List<T> findall();
    Optional<T> findById(ID id);
    T save(T entity);
    void deleteById(ID id);


}
