package pl.edu.wsiz.io11.part2;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Employee {
    private String firstname;
    private String lastname;
    private byte age;
    private Sex sex;
    private int salary;
    private String[] skills;

    public Employee(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.skills = skills;
    }

    public boolean isEqual(Employee employee) {
        return firstname.equalsIgnoreCase(employee.firstname) &&
                lastname.equalsIgnoreCase(employee.lastname) &&
                age == employee.age;
    }

    public void print() {
        System.out.println(this);
    }

    public static void print(Employee employee) {
        employee.print();
    }

    @Override
    public String toString() {
        char sexChar = this.sex == Sex.FEMALE ? 'K' : 'M';
        String skillsStr = String.join(", ", skills);

        return String.format("%c %s %s %d %c %dzł [%s]", getJobSymbol(), firstname, lastname, age, sexChar, salary, skillsStr);
    }

    protected static String readFirstname() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:      ");

        return scanner.next();
    }

    protected static String readLastname() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwisko:  ");

        return scanner.next();
    }

    protected static byte readAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wiek:      ");

        return scanner.nextByte();
    }

    protected static Sex readSex() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj płeć:      ");
        String sexStr = scanner.next();

        return sexStr.toUpperCase().charAt(0) == 'K' ? Sex.FEMALE : Sex.MALE;
    }

    protected static int readSalary() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj zarobki:   ");
        int salary = scanner.nextInt();
        scanner.nextLine();

        return salary;
    }

    protected static String[] readSkills() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj umiejętności: ");
        String skillsStr = scanner.nextLine();

        String[] skillsArr = skillsStr.split(",");

        for (int i = 0; i < skillsArr.length; i++) {
            skillsArr[i] = skillsArr[i].trim();
        }

        return skillsArr;
    }

    protected abstract char getJobSymbol();
}
