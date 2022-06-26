package pl.edu.wsiz.io11.part00;

import java.util.Scanner;


public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Podaj tekst: ");
        int liczba = scanner.nextInt();
        boolean isEven = liczba %2 ==0;
        System.out.printf(" Liczba %d jest %s" , liczba , isEven ? "parzysta" : "nieparzysta");
    }

/*    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print    (" Podaj liczbę:  ");
int number = scanner.nextInt();
boolean isEven = number %2 ==0;
        System.out.printf(" " , number, isEven? "parzysta": "nie parzysta");
    }
*/
}
