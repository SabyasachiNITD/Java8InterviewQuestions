import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    String firstName;


    String lastName;
    int empId;
    int Salary;

    public Employee(String firstName, String lastName, int empId, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        Salary = salary;
    }




    public int compareTo(Employee e) {
        int res = this.firstName.compareToIgnoreCase(e.firstName);
        if(res == 0)
            return this.lastName.compareToIgnoreCase(e.lastName);
        return res;
    }
}
