import java.util.Scanner;

public class lkj {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ведите 4-значное число");
        int q = in.nextInt();
        int r = (q % 10000 / 1000);
        int t = (q % 1000 / 100);
        int y = (q % 100 / 10);
        int u = (q % 10);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);
        System.out.println(u);
        System.out.println(r+t+y+u +" ");
    }
}
