package com.low.design.solid.priciples.liskovSubstitution.solution;

public class RegularEmp implements EmpAbstract {

    // Child class should handle exception it self
    @Override
    public void calSal() {
        System.out.println("regular salary......");
        try {
            throw  new RuntimeException();
        } catch (Exception exception) {

        }

    }
}
