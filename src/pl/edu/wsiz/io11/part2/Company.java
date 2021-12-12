package pl.edu.wsiz.io11.part2;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employeesArrayList = new ArrayList<>();

    public void add(Employee employee) {
        employeesArrayList.add(employee);
    }
}
