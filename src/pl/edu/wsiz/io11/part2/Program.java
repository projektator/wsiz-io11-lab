package pl.edu.wsiz.io11.part2;

public class Program {
    public static void main(String[] args) {

        Company company = new Company();

        Employee employee1 = new Employee("Jan1", "Kowalski1", (byte) 31);
        company.add(employee1);
        company.add(new Employee("Jan2", "Kowalski2", (byte) 31));
    }
}
