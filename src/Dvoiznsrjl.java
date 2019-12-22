import java.util.Scanner;

public class Dvoiznsrjl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число");
        int w = in.nextInt();
        int c = 0;
        int d = 1;
        for (int q = 0; true; q++) {

            if (w % 2 == 0) {
            }
            if (w % 2 == 1) {
                c = c + d;

            }
            if (w == 1) {
                break;
            }
            w = w / 2;
            d = d * 10;
        }
        System.out.println(c);


    }
}

