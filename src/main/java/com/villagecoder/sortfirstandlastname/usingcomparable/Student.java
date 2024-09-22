package com.villagecoder.sortfirstandlastname.usingcomparable;

public class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student s) {
        int result = this.firstName.compareToIgnoreCase(s.firstName);
        if(result == 0){
            result = this.lastName.compareToIgnoreCase(s.lastName);
        }
        return result;
    }

}

/*
    GIVEN A LIST OF STUDENTS. SORT THE STUDENTS ON BASIS OF THEIR FIRST AND LAST NAME
    USE COMPARABLE AND PRINT THE LIST
 */