package pl.edu.wsiz.io11.part2;

import java.util.Scanner;
import java.util.StringJoiner;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills, int teamSize) {
        super(firstname, lastname, age, sex, salary, skills);
        this.teamSize = teamSize;
    }

    public static Manager read() {
        return new Manager(readFirstname(), readLastname(), readAge(), readSex(), readSalary(), readSkills(), readTeamSize());
    }

    @Override
    public String toString() {
        return super.toString() + " " + teamSize;
    }

    @Override
    protected char getJobSymbol() {
        return 'K';
    }

    private static int readTeamSize() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozm. zespołu: ");

        return scanner.nextInt();
    }
}
