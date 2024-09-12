import javax.annotation.processing.SupportedSourceVersion;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        JavaNew javanew = new JavaNew();
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Arnab","Mandal",131,100));
        emps.add(new Employee("Sabya","Ghosh",132,50));
        emps.add(new Employee("Sabya","Yadav",121,50));
        emps.add(new Employee("Diba","Mandal",133,200));
        emps.add(new Employee("Diba","Ghosh",100,200));
        emps.add(new Employee("Aks","Mandal",137,200));
        emps.add(new Employee("Raja","Khan",130,150));

        System.out.println("Sort Employees based on their first Name and last name :");
        System.out.println("---------------------------");
        // Sort Elements by firstName and LastName
        javanew.sortByFirstNameAndLastName(emps).stream().forEach(a -> System.out.println(a.firstName + " " + a.lastName));
        System.out.println("---------------------------");

        // count of salaries
        System.out.println("All Salary Frequency : ");
        System.out.println("---------------------------");
        javanew.countSalaryFrequency(emps).entrySet().forEach(e -> System.out.println(e.getKey().toString() + " " +  e.getValue().toString()));
        System.out.println("---------------------------");

        //employees with distinct first name
        System.out.println("Employees with distinct first name");
        System.out.println("---------------------------");
        javanew.printDistinctEmployee(emps);
        System.out.println("---------------------------");

        //employees with unique first name
        System.out.println("Employees with distinct first name");
        System.out.println("---------------------------");
        emps.stream().collect(Collectors.groupingBy(e -> e.firstName, Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue()==1).forEach(e -> System.out.println(e.getKey()));
        System.out.println("---------------------------");

        //last name of employess with duplicate last name
        //employees with unique first name
        System.out.println("Duplicate last names :");
        System.out.println("---------------------------");
        emps.stream().collect(Collectors.groupingBy(e->e.lastName,Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue()>1).forEach(e -> System.out.println(e.getKey()));
        System.out.println("---------------------------");
    }


}