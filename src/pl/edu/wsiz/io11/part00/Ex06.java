package pl.edu.wsiz.io11.part00;

public class Ex06 {
    public static void main(String[] args) {
        int number = 14;
        while (number >= 0)
        {
            System.out.printf(" %d%s", number, number > 0 ? " ," : "");
            number--;
        }
    }}
