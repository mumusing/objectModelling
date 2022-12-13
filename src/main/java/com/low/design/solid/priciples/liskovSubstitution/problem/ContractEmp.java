package com.low.design.solid.priciples.liskovSubstitution.problem;

public class ContractEmp implements EmpAbstract{
    @Override
    public void calSal() {
        System.out.println("Contract Emp.........");
    }
}
