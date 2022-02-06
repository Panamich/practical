package work22;

public class Task22 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis()/1000;
        final int value = 60;
        long sec = time % value;
        time /= value;
        long min = time % value;
        time /= value;
        long hour = (time + 2) % 24;
        long day = time / 24;
        System.out.println("Текущее время " + day + ":" + hour + ":" + min + ":" + sec);
    }
}
