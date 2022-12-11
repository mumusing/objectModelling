package com.low.design.solid.priciples.dependencyInjection.problem;

import com.low.design.solid.priciples.interfaceSegregation.solution.IUserService;

public class UserService implements IUserService{
    @Override
    public String createUserAcount(String name, String address, String age, String phonenum) {
        // EmailService change then will require code change for this UserService class
        // Here User Service depend on low level module  EmailService
//        UserRepository userRepo = new UserRepository();
//        EmailService emailservice = new TwillioEmailService( Some credentials );
//        //Implementation Logic
//       ...
//        userRepo.save(Some object params);
//        emailservice.sendmail(some object params);
//       ...
        return "Some Response String";
    }
}
