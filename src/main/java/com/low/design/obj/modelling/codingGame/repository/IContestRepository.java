package com.low.design.obj.modelling.codingGame.repository;

import com.low.design.obj.modelling.codingGame.entity.Contest;
import com.low.design.obj.modelling.codingGame.entity.Level;

import java.util.List;

public interface IContestRepository extends CRUDRepository<Contest, String> {

    public List<Contest> findAllContestLevelWise(Level level);

}
