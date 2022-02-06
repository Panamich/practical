package work32;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите суму депозита ");
        double dep = scanner.nextDouble();
        System.out.print("Введите срок депозита в месяцах ");
        double month = scanner.nextDouble();
        double perc = 12;
        double prof = (dep / 100) * perc;
        double inc = prof * month;
        System.out.println("Сумма дохода составляет " + inc);

    }
}
