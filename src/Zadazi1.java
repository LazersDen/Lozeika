import java.util.Random;
import java.util.Scanner;

public class Zadazi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int x = rnd.nextInt(60);
        System.out.println(x);
        if (x >= 0 && x <= 15) {
            System.out.println("Число попадает в первую четверть часа");
        }
        if (x > 15 && x <= 30) {
            System.out.println("Число попадает в во вторую четверть часа");
        }
        if (x > 30 && x <= 45) {
            System.out.println("Число попадает в третью четверть часа");
        }
        if (x > 45 && x <= 59) {
            System.out.println("Число попадает в четвертую четверть часа");
        }
    }
}
