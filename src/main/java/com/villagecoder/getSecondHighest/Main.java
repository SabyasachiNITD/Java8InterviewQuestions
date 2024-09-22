/*
    GIVEN A LIST OF STUDENTS.
    PRINT THE FULL NAME OF THE STUDENT WITH SECOND-HIGHEST MARK
    YOU CAN ONLY USE JAVA 8 FEATURES -- ASSUME THERE IS NO STUDENT WITH DUPLICATE MARKS
 */
package com.villagecoder.getSecondHighest;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add( new Student(1,"Ramswaroop","Soren",80));
        students.add( new Student(2,"Sabyasachi","Ghosh",75));
        students.add( new Student(3,"Subhadip","Patra",95));
        students.add( new Student(4,"Ashish","Agarwal",90));
        students.add( new Student(5,"Arpan","Chatterjee",85));

        students.stream().sorted((s1,s2)-> s1.mark > s2.mark ? -1 : 1)
                .skip(1).findFirst().ifPresent(s -> System.out.println(s.firstName + " " + s.lastName));
    }
}