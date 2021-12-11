package pl.edu.wsiz.io11.part1;

public class Exercise09 {

    /**
       9. Napisz metodę wyznaczającą średnią arytmetyczną w tablicy liczb rzeczywistych.
     */

    public static void main(String[] args) {
        double[] tab = {2, 6, 16};

        System.out.println("Średnia: " + calcAverage(tab));
    }

    static double calcAverage(double[] tab) {
        double sum = 0;
        for (double number : tab) {
            sum += number;
        }
        return sum / tab.length;
    }
}
