package pl.edu.wsiz.io11.part03;

public class Employee {
String firstname ;  //string jest typem referencyjnym czyli wskazuje na inny obiekt.
String lastname ;
byte age;

void print() {
    //z poprzedniego zadania
    System.out.println(firstname + " " + lastname + "   " + age);

    }

static void print(Employee employee) {

}

    static Employee read() {
        Employee employee = new Employee(); // stworzysliśmy pustą instancję
employee.firstname = "Wlazło";
            return employee;
        }
    }
