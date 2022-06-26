package pl.edu.wsiz.io11.part00;

public class Ex09 {

    public static void main(String[] args) {

        double[] tab = {2, 3, 7};
        System.out.println("Średnia: " + calcAverage(tab));
    }
    static double calcAverage(double[] tab) {
        double sum = 0;
        for (double number : tab) {
        sum += number;
    }
    return sum /tab.length;
}
}
