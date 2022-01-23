package pl.edu.wsiz.io11.part2;

import java.util.Scanner;

public class Manager extends Employee {

    private static final double BONUS_FACTOR_PER_STEP = 0.05;
    private static final byte NUMBER_OF_PEOPLE_PER_BONUS_STEP = 5;

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

    @Override
    protected double getTotalSalary() {
        return getSalary() * (1 + (teamSize / NUMBER_OF_PEOPLE_PER_BONUS_STEP) * BONUS_FACTOR_PER_STEP);
    }

    private static int readTeamSize() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozm. zespołu: ");

        return scanner.nextInt();
    }
}
