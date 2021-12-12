package pl.edu.wsiz.io11.part2;

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

}
