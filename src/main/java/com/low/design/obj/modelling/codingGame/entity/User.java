package com.low.design.obj.modelling.codingGame.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User extends BaseEntity {

    private final String name;
    private final Integer score;
    private List<Contest> contests;
    private UserContestQuestions userContestQuestions;
    
    public User(User user) {
        this(user.id, user.name, user.score, user.contests);
        userContestQuestions = user.userContestQuestions;
    }


    public User(String id, String name, Integer score, List<Contest> contests) {
        this(id, name, score);
        this.contests = contests;
    }

    public User(String id, String name, Integer score) {
        this(name,score);
        this.id = id;
        this.userContestQuestions = new UserContestQuestions();
    }

    public User(String name, Integer score) {
        this.name = name;
        this.score = score;
        this.contests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    public void addContest() {

    }

    public void deleteContest(Contest contest) {

    }

    public List<Contest> getContests() {
        return Collections.emptyList();
    }

    public boolean checkIfContestExists(Contest contest) {
       return false;
    }

    public void addContestQuestion(Contest contest, List<Question> questionList) {

    }

    public List<Question> getQuestionsByContest(Contest contest) {
      return   Collections.emptyList();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", contests=" + contests + ", name=" + name + ", score=" + score + "]";
    }

}
