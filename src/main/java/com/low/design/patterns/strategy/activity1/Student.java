package com.low.design.patterns.strategy.activity1;

public class Student {

    private int rillNo;
    private String firstName;
    private String lastName;

    public Student(int rillNo, String firstName, String lastName) {
        this.rillNo = rillNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getRillNo() {
        return rillNo;
    }

    public void setRillNo(int rillNo) {
        this.rillNo = rillNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rillNo=" + rillNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
