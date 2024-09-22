/*
    GIVEN A LIST OF STUDENTS. SORT THE STUDENTS ON BASIS OF THEIR FIRST AND LAST NAME
    USE COMPARATOR AND PRINT THE LIST
 */

package com.villagecoder.sortfirstandlastname.usingcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Arnab","Mandal",80));
        students.add(new Student(2,"Sabya","Ghosh",75));
        students.add(new Student(3,"Sabya","Yadav",85));
        students.add(new Student(4,"Diba","Mandal",65));
        students.add(new Student(5,"Diba","Ghosh",50));
        students.add(new Student(6,"Aks","Mandal",55));
        students.add(new Student(7,"Raja","Khan",45));


        System.out.println("Students sorted on basis of their first name and last name:----");
        students.sort((s1, s2) -> (s1.firstName.compareToIgnoreCase(s2.firstName) == 0
                ? s1.lastName.compareToIgnoreCase(s2.lastName)
                : s1.firstName.compareToIgnoreCase(s2.firstName)));
        students.forEach(s -> System.out.println(s.firstName + " " + s.lastName));
    }
}
