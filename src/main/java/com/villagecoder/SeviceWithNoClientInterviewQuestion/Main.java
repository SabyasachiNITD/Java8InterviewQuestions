/*
    Given a List of Integers. Find out the Frequency of Each Numbers in the List using
    JAVA 8 features: Stream API and Lambda Expressions
*/


package com.villagecoder.SeviceWithNoClientInterviewQuestion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List<String> services = Arrays.asList("s1","s2","s3","s4","s5");
        Map<String,List<String>> customers = new HashMap<>();

        HashMap<String,Integer> mp = new HashMap<>();



        while(true){
            System.out.println("1 to create and 2 to delete customer");
            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
            if(index==1){
                createCustomer(mp,customers);
            }
            else if(index==2){
                deleteCustomer(mp,customers);
            }
            else
            {
                System.out.println("wrong input..terminating");
                break;
            }
        }





    }
    public static void createCustomer(HashMap<String,Integer> mp,Map<String,List<String>> customers){
        System.out.println("Enter Customer Name:");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();

        System.out.println("services you want:");
        String serv = sc.nextLine();
        List<String> serviceList = Arrays.asList(serv.split(","));
        customers.put(customerName,serviceList);
        serviceList.forEach(e-> mp.put(e,mp.getOrDefault(e,0)+1));
        System.out.println("Customer Created");
    }

    public static void deleteCustomer(HashMap<String,Integer> mp,Map<String,List<String>> customers) {
        System.out.println("Enter Customer To Delete: ");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        System.out.println("services getting removed: ");
        customers.get(customerName).forEach(e -> mp.put(e, mp.get(e)-1));
        mp.entrySet().stream().filter(e -> e.getValue()==0).forEach(System.out::println);

    }
}
