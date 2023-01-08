package com.low.design.obj.modelling.codingGame.services;

import com.low.design.obj.modelling.codingGame.dto.UserRegistrationDto;
import com.low.design.obj.modelling.codingGame.entity.*;
import com.low.design.obj.modelling.codingGame.exceptions.ContestNotFoundException;
import com.low.design.obj.modelling.codingGame.exceptions.InvalidOperationException;
import com.low.design.obj.modelling.codingGame.exceptions.UserNotFoundException;
import com.low.design.obj.modelling.codingGame.repository.IContestRepository;
import com.low.design.obj.modelling.codingGame.repository.IUserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserService implements IUserService {

    private final IUserRepository userRepository;
    private final IContestRepository contestRepository;

    public UserService(IUserRepository userRepository, IContestRepository contestRepository) {
        this.userRepository = userRepository;
        this.contestRepository = contestRepository;
    }

    @Override
    public User create(String name) {
        return userRepository.save(new User(name, 0));
    }

    @Override
    public List<User> getAllUserScoreOrderWise(ScoreOrder scoreOrder) {

        List<User> user = userRepository.findAll();
        Comparator<User> comparator = Comparator.comparing(User::getScore);

        if (scoreOrder.equals(ScoreOrder.DESC)) {
            comparator = comparator.reversed();
        }

        Collections.sort(user, comparator);

        return user;
    }

    @Override
    public UserRegistrationDto attendContest(String contestId, String userName) throws ContestNotFoundException, UserNotFoundException, InvalidOperationException {
        Contest contest = contestRepository.findByID(contestId).orElseThrow(() -> new ContestNotFoundException("Cannot Attend Contest. Contest for given id:"+contestId+" not found!"));
        User user = userRepository.findByName(userName).orElseThrow(() -> new UserNotFoundException("Cannot Attend Contest. User for given name:"+ userName+" not found!"));
        if(contest.getContestStatus().equals(ContestStatus.IN_PROGRESS)){
            throw new InvalidOperationException("Cannot Attend Contest. Contest for given id:"+contestId+" is in progress!");
        }
        if(contest.getContestStatus().equals(ContestStatus.ENDED)){
            throw new InvalidOperationException("Cannot Attend Contest. Contest for given id:"+contestId+" is ended!");
        }
        if(user.checkIfContestExists(contest)){
            throw new InvalidOperationException("Cannot Attend Contest. Contest for given id:"+contestId+" is already registered!");
        }
        user.addContest(contest);
        userRepository.save(user);
        return new UserRegistrationDto(contest.getName(), user.getName(), RegisterationStatus.REGISTERED);
    }

    @Override
    public UserRegistrationDto withdrawContest(String contestId, String userName) throws ContestNotFoundException, UserNotFoundException, InvalidOperationException {
        Contest contest=contestRepository.findByID(contestId).orElseThrow(()->new ContestNotFoundException("Cannot Attend Contest. Contest for given id:"+contestId+" not found!"));
        User user=userRepository.findByName(userName).orElseThrow(()->new UserNotFoundException("Cannot Attend Contest. User for given name:"+ userName+" not found!"));

        if (contest.getContestStatus().equals(ContestStatus.IN_PROGRESS)) {
            throw new InvalidOperationException("Cannot withdraw Contest. Contest for given id:"+contestId+" is in progress!");
        }
        if (contest.getContestStatus().equals(ContestStatus.ENDED)) {
            throw new InvalidOperationException("Cannot withdraw Contest. Contest for given id:"+contestId+" has in ENDED!");
        }
        if (contest.getCreator().getName().equalsIgnoreCase(user.getName())) {
            throw new InvalidOperationException("Cannot withdraw Contest. Contest for given id:"+contestId+" is creater of contest");
        }
        //    System.out.println(user.checkIfContestExists(contest));
        if (!(user.checkIfContestExists(contest))) {
            throw new InvalidOperationException("Cannot withdraw Contest. Contest for given id:"+contestId+" is create not register for contest");
        }
        user.deleteContest(contest);
        userRepository.save(user);
        //  contest.endContest();
        //  userRepository.delete(user);

        return new UserRegistrationDto(contest.getName(), user.getName(),RegisterationStatus.NOT_REGISTERED);
    }
}
