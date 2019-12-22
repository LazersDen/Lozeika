import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int q = rnd.nextInt(65555-10000);
        if (1 == (q/10000)) {
            System.out.println("Да");
        }
        if (2 == (q/10000)) {
            System.out.println("Да");
        }
        if (3 == (q/10000)) {
            System.out.println("Да");
        }
        if (4 == (q/10000)) {
            System.out.println("Нет");
        }
        if (5 == (q/10000)) {
            System.out.println("Нет");
        }else System.out.println("Нет");


    }
}
