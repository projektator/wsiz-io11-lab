package pl.edu.wsiz.io11.part2;

import java.util.Scanner;

public class Developer extends Employee {

    public Developer(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    public static Developer read() {
        return new Developer(readFirstname(), readLastname(), readAge(), readSex(), readSalary(), readSkills());
    }
}
