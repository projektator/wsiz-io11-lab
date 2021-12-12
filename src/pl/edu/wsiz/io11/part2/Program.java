package pl.edu.wsiz.io11.part2;

public class Program {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.firstname = "Jan";
        employee.lastname = "Kowalski";
        employee.age = 31;

        employee.print();
        Employee.print(employee);
    }
}
