package pl.edu.wsiz.io11.part2;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employeesArrayList = new ArrayList<>();

    public void add(Employee employee) {
        employeesArrayList.add(employee);
    }

    public void printEmployees() {
        System.out.println("--------------------");

        int number = 1;
        for (Employee employee : employeesArrayList) {
            System.out.print(number++ + "  ");
            employee.print();
        }

//        for (Employee employee : employeesArrayList) {
//            System.out.print(employeesArrayList.indexOf(employee) + 1 + "  ");
//            employee.print();
//        }

//        for (int i = 0; i < employeesArrayList.size(); i++) {
//            System.out.print(i + 1 + "  ");
//            employeesArrayList.get(i).print();
//        }

        System.out.println("--------------------");
    }
}
