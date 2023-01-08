package com.low.design.patterns.strategy.activity1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(1, "mukesh", "singh"));
        studentList.add(new Student(2, "alok", "singh"));
        studentList.add(new Student(3, "ravi", "singh"));
        studentList.add(new Student(4, "adarh", "singh"));

        Comparator<Student> comparisionStrategy = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };

        Collections.sort(studentList, comparisionStrategy);

        studentList.stream().forEach(student -> System.out.println(student.toString()));


        Comparator<Student> studentComparator2 = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getRillNo() - o2.getRillNo();
            }
        };

        System.out.println();

        Collections.sort(studentList, studentComparator2);

        studentList.stream().forEach(student -> System.out.println(student.toString()));





    }




}
