package pl.edu.wsiz.io11.part2;

public class Manager extends Employee {

    public Manager(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    public static Manager read() {
        return new Manager(readFirstname(), readLastname(), readAge(), readSex(), readSalary(), readSkills());
    }

    @Override
    public void print() {
        System.out.print("K ");
        super.print();
    }
}
