package pl.edu.wsiz.io11.part03;


public class Program { //nazwa clasy programu startotwego
    public static void main(String[] args) {
/*        Employee employee = new Employee(); //nazwa metody w pakiecie.
        employee.firstname = "Grazka";
        employee.lastname = "Wlazi ";
        employee.age = 33;*/

Employee employee2 = Employee.read();

        employee2.print(); //metoda employee.print.

    }
}
