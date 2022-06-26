package pl.edu.wsiz.io11.part00;

import java.util.Scanner;

public class Ex05 {
//divident factor modulo
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj dzielną: ");
    int dividend = scanner.nextInt();
    System.out.print("Podaj dzielnik: ");

    int factor = scanner.nextInt();
    int modulo = dividend % factor;

    String result = modulo ==0 ? "" : "nie";
    System.out.printf(" %d %s dzieli się przez %d", dividend, result, factor);

}
}
