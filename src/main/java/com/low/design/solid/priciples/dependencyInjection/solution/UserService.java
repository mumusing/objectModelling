package com.low.design.solid.priciples.dependencyInjection.solution;

import com.low.design.solid.priciples.interfaceSegregation.solution.IUserService;

public class UserService implements IUserService{
    //
/*
    private final UserRepository userRepo;
    private final EmailService emailservice;

    // UserService can now be initialized with service of your choice.
    // Eg:- UserService userService = new UserService(new MongoUserRepository(), new SendGridEmailService());

    public UserService(UserRepository userRepo, EmailService emailService){
        this.userRepo = userRepo;
        this.emailService = emailservice
    }
*/

    @Override
    public String createUserAcount(String name, String address, String age, String phonenum) {
        // Now UserService will not require change even EmailService change
//       ...
//        userRepo.save(Some object params);
//        emailservice.sendmail(some object params);
//       ...
        return "Some Response String";
    }
}
