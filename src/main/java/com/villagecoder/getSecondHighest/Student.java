package com.villagecoder.getSecondHighest;

public class Student{
    int rollNumber;
    String firstName;
    String lastName;
    int mark;

    public Student(int rollNumber, String firstName, String lastName,int mark) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

}

/*
    GIVEN A LIST OF STUDENTS.
    PRINT THE FULL NAME OF THE STUDENT WITH SECOND-HIGHEST MARK
    YOU CAN ONLY USE JAVA 8 FEATURES -- ASSUME THERE IS NO STUDENT WITH DUPLICATE MARKS
 */