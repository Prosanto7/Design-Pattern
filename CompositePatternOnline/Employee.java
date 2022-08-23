package CompositePatternOnline;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int salary;
    private String designation;
    private List<Employee> subordinates;

    public Employee(String name, String designation, int salary) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return subordinates;
    }

    public void showDetails() {
        System.out.println(this.name + " " + this.salary + " " + this.designation);
        for (Employee employee : this.subordinates) {
            employee.showDetails();
        }
    }
}
