package pl.edu.wsiz.io11.part2;

import java.util.Scanner;

public class Employee {
    String firstname;
    String lastname;
    byte age;

    void print() {
        System.out.println(firstname + " " + lastname + " " + age);
    }

    static void print(Employee employee) {
        employee.print();
        // System.out.println(employee.firstname + " " + employee.lastname + " " + employee.age);
    }

    static Employee read() {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:      ");
        employee.firstname = scanner.next();

        System.out.print("Podaj nazwisko:  ");
        employee.lastname = scanner.next();

        System.out.print("Podaj wiek:      ");
        employee.age = scanner.nextByte();

        return employee;
    }

}
