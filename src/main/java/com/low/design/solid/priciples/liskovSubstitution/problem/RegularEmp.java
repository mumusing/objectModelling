package com.low.design.solid.priciples.liskovSubstitution.problem;

public class RegularEmp implements EmpAbstract{

    // Child class should not throw exception for parent method
    @Override
    public void calSal() throws RuntimeException{
        System.out.println("regular salary......");
        throw  new RuntimeException();
    }
}
