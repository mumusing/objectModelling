package com.low.design.obj.modelling.codingGame.repository;

import com.low.design.obj.modelling.codingGame.entity.User;

import java.util.List;
import java.util.Optional;

public class UserRepository implements IUserRepository {
    @Override
    public Optional<User> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findByID(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsByID(String s) {
        return false;
    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public long count() {
        return 0;
    }
}
