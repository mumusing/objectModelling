package com.low.design.solid.priciples.liskovSubstitution.solution;

public class ContractEmp implements EmpAbstract {
    @Override
    public void calSal() {
        System.out.println("Contract Emp.........");
    }
}
