/*
    Given a List of Integers. Find out the Frequency of Each Numbers in the List using
    JAVA 8 features: Stream API and Lambda Expressions
*/


package com.villagecoder.frequencyOfNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,2,8,7,1,6,6,7,9,11,1,4);
        list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "-> " + entry.getValue()));
    }
}
