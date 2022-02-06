package work23;

public class Task23 {
    public static void main(String[] args) {
        int x = 9;
        int y = 3;
        System.out.println("Начальные цифры: x = " + x + ", y = " + y );
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("После перестановки: x = " + x + ", y = " + y );
    }
}