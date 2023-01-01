package com.low.design.obj.modelling.codingGame.repository;

import com.low.design.obj.modelling.codingGame.entity.User;

import java.util.Optional;

public interface IUserRepository extends CRUDRepository<User, String> {
    public Optional<User> findByName(String name);
}
