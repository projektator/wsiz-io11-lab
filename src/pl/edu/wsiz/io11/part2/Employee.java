package pl.edu.wsiz.io11.part2;

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


}
