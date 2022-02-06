package work24;

public class task24 {
    public static void main(String[] args) {
        int number = 258;
        int num = number;
        int div = 10;
        int hun = (number % div) * 100;
        number /= div;
        int doz = (number % div) * div;
        number /= div;
        int reverse = hun + doz + number;

        System.out.println(num + " - " + reverse + " = " + (num - reverse));
    }
}
