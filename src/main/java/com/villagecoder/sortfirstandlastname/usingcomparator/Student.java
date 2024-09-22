package com.villagecoder.sortfirstandlastname.usingcomparator;

public class Student {
    int rollNumber;
    String firstName;
    String lastName;
    int mark;

    public Student(int rollNumber, String firstName, String lastName, int mark) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

}

/*
    GIVEN A LIST OF STUDENTS. SORT THE STUDENTS ON BASIS OF THEIR FIRST AND LAST NAME
    USE COMPARATOR AND PRINT THE LIST
 */