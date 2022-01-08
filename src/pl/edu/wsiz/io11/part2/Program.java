package pl.edu.wsiz.io11.part2;

public class Program {
    public static void main(String[] args) {
        Company company = new Company();

        company.add(new Employee("Jan", "Kowalski", (byte) 31));
        company.add(new Employee("Anna", "Kowalczyk", (byte) 27));
        company.add(new Employee("Piotr", "Nowak", (byte) 36));

        company.printEmployees();
    }
}
