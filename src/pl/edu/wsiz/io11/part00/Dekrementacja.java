package pl.edu.wsiz.io11.part00;

public class Dekrementacja {
    public static void main(String[] args) {
        int a = 6;
        var b = 7;
        int c = a + b++;
        System.out.printf("a: %d b: %d c: %d ", a, b, c);
        //System.out.println(c);
    }
}

