import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;

import static java.util.stream.Collectors.groupingBy;

public class JavaNew {
    public List<Employee> sortByFirstNameAndLastName(List<Employee> employees) {
        Collections.sort(employees, ((e1, e2) -> e1.firstName.compareToIgnoreCase(e2.firstName) == 0 ? e1.lastName.compareToIgnoreCase(e2.lastName) : e1.firstName.compareToIgnoreCase(e2.firstName)));
        return employees;
    }

    public Map<Integer,Long> countSalaryFrequency(List<Employee> emps) {
        Map<Integer, Long> mp = emps.stream().collect(groupingBy(p -> p.Salary, Collectors.counting()));
        return mp;
    }

    public void printDistinctEmployee(List<Employee> emps) {
        emps.stream().map(e -> e.firstName).distinct().forEach(System.out::println);
    }


}
