package com.low.design.obj.modelling.codingGame.repository;

import java.util.List;
import java.util.Optional;

public interface CRUDRepository<T,ID> {

    public T save(T entity);
    public List<T> findAll();
    public Optional<T> findByID(ID id);
    boolean existsByID(ID id);
    public void delete(T entity);
    public void deleteById(ID id);
    public long count();

}
