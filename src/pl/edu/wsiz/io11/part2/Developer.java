package pl.edu.wsiz.io11.part2;

public class Developer extends Employee {
    private static final double BONUS_FACTOR_PER_SKILL = 0.02;

    public Developer(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    public static Developer read() {
        return new Developer(readFirstname(), readLastname(), readAge(), readSex(), readSalary(), readSkills());
    }

    @Override
    protected char getJobSymbol() {
        return 'P';
    }

    @Override
    protected double getTotalSalary() {
        return getSalary() * (1 + BONUS_FACTOR_PER_SKILL * getSkills().length);
    }
}
