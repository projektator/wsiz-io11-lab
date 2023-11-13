package pl.edu.wsiz.io11.part2;

public class Program {
    public static void main(String[] args) {

        Ekipa ekipa = new Ekipa();
        ekipa.firstname = "Grażka";
        ekipa.lastname = "Kowalska";
        ekipa.age = 61;

        ekipa.print();
        Ekipa.print(ekipa);
    }
}