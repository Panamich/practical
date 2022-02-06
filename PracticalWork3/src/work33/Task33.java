package work33;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену шкафа ");
        double prc = scanner.nextDouble();
        System.out.print("Введите падение цены ");
        double diff = scanner.nextDouble();
        System.out.print("Введите рост курса долара ");
        double grow = scanner.nextDouble();
        double fall = diff / 100;
        double curs = grow / 100;
        double price = prc - (prc * fall);
        double sum = price + (price * curs);
        System.out.println("Окончательная цена шкафа " + sum);

    }
}
