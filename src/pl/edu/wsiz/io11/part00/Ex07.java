package pl.edu.wsiz.io11.part00;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Podaj ilość liczb: ");
        int length =scanner.nextInt();
        System.out.print("\n");

        double min = Double.MAX_VALUE, max= -Double.MAX_VALUE;
for (int i=1; i<=length; i++) {
    System.out.printf("Podaj liczbę nr %d: ", i);
    double number = scanner.nextDouble();
    if (number < min) {
        min = number;
    }
    if (number > max) {
        max = number;
    }

}
        System.out.printf("\nNajwiększa z podanych liczb to: %f", min);
        System.out.printf("\nNajwiększa z podanych liczb to: %f", max);
    }}
