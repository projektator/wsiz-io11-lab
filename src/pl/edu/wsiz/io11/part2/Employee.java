package pl.edu.wsiz.io11.part2;

import java.util.Scanner;

public class Employee {
    private String firstname;
    private String lastname;
    private byte age;
    private Sex sex;
    private int salary;

    public Employee(String firstname, String lastname, byte age, Sex sex, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public boolean isEqual(Employee employee) {
        return firstname.equalsIgnoreCase(employee.firstname) &&
                lastname.equalsIgnoreCase(employee.lastname) &&
                age == employee.age;
    }

    public void print() {
        char sexChar = this.sex == Sex.FEMALE ? 'K' : 'M';
        System.out.printf("%s %s %d %s %dzł\n", firstname, lastname, age, sexChar, salary);
//        System.out.println(firstname + " " + lastname + " " + age + " " + sexChar + " " + salary + "zł");
    }

    public static void print(Employee employee) {
        employee.print();
    }

    public static Employee read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:      ");
        String firstname = scanner.next();

        System.out.print("Podaj nazwisko:  ");
        String lastname = scanner.next();

        System.out.print("Podaj wiek:      ");
        byte age = scanner.nextByte();

        System.out.print("Podaj płeć:      ");
        String sexStr = scanner.next();
        Sex sex = sexStr.toUpperCase().charAt(0) == 'K' ? Sex.FEMALE : Sex.MALE;

        System.out.print("Podaj zarobki:   ");
        int salary = scanner.nextInt();

        return new Employee(firstname, lastname, age, sex, salary);
    }
}
