import java.util.Random;
import java.util.Scanner;

public class Ah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("Ведите число 1 до 100");
        int q = rnd.nextInt(101);
        System.out.println(q);
        if (q >= 0 && q <= 100) {
            for (int w = 0; w <= 100; w++) {
                if (q > w) {
                    System.out.println("Ваше число больше чисела  " + w);
                }
            }
        } else {
            System.out.println("Ведите коректное число 1 до 100  \n  Пример \n 10 \n 46 \n 89");
        }


    }
}
