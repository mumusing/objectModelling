package com.low.design.obj.modelling.codingGame.repository;

import com.low.design.obj.modelling.codingGame.entity.Contest;
import com.low.design.obj.modelling.codingGame.entity.Level;

import java.util.List;
import java.util.Optional;

public class ContestRepository implements IContestRepository {
    @Override
    public List<Contest> findAllContestLevelWise(Level level) {
        return null;
    }

    @Override
    public Contest save(Contest entity) {
        return null;
    }

    @Override
    public List<Contest> findAll() {
        return null;
    }

    @Override
    public Optional<Contest> findByID(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsByID(String s) {
        return false;
    }

    @Override
    public void delete(Contest entity) {

    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public long count() {
        return 0;
    }
}
