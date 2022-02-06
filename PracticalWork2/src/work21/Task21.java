package work21;

public class Task21 {
    public static void main(String[] args) {
        int week = 3;
        int day = 7;
        int hour = 24;
        int minute = 60;
        int second = 60;
        int result;
        result = week * day * hour * minute * second;
        System.out.println("В трёх неделях " + result + " секунд");
    }
}
