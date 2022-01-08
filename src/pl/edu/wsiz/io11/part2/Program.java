package pl.edu.wsiz.io11.part2;

public class Program {
    public static void main(String[] args) {
        Company company = new Company();

        company.addEmployee(new Employee("Jan", "Kowalski", (byte) 31));
        company.addEmployee(new Employee("Anna", "Kowalczyk", (byte) 27));
        company.addEmployee(new Employee("Piotr", "Nowak", (byte) 36));

//        Employee e1 = new Employee("piotr", "nowak", (byte) 36);
//        Employee e2 = new Employee("Piotr", "NowaK", (byte) 36);
//
//        company.addEmployee(e1);
//        company.addEmployee(e2);
//
//        company.addEmployee();

        company.printEmployees();

        company.removeEmployee(0);

        company.printEmployees();

        company.removeEmployee(3);

        company.printEmployees();

        company.removeEmployee(3);

        company.printEmployees();
    }
}
