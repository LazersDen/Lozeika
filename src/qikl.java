import java.util.Scanner;

public class qikl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число");
        int q = in.nextInt();
        int w = 0;
        while (q > 0) {
            int e = q % 10;
            q = q / 10;

            w =e+ w;


        }System.out.println(w);
    }
}
