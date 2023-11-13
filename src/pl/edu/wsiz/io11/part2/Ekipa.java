package pl.edu.wsiz.io11.part2;

public class Ekipa {
    String firstname;
    String lastname;
    byte age;

    void print() {
        System.out.println(firstname + " " + lastname + " " + age);
    }

    static void print(Ekipa ekipa) {
        ekipa.print();
        // System.out.println(ekipa.firstname + " " + ekipa.lastname + " " + employee.age);
    }

}
