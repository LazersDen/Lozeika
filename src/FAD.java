import java.util.Scanner;

public class FAD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите стаж работы от 0 года до 20 и выше");
        int q = in.nextByte();
        if (q >= 0 && q <= 3) {
            System.out.println("Надбавка составляет 0%");
        }
        if (q >= 3 && q <= 10) {
            System.out.println("Надбавка составляет 10%");
        }
        if (q >= 10 && q <= 20) {
            System.out.println("Надбавка составляет 20%");
        }
        if (q >= 20 && q <= 100) {
            System.out.println("Надбавка составляет 25%");
        }


    }
}
