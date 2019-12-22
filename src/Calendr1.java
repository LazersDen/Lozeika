
import java.util.Scanner;
public class Calendr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int r = 0;
        int t = 0;
        System.out.println("Date \n Day \n Monnhic");
        int q = in.nextInt();
        int w = in.nextInt();
        for (int e = 0; e < 12; e++) {
            if (w - 1 == e) {
                t = t + q;
                break;
            } else {
                t = a[e] + t;
            }
        }
        System.out.println("Days " + t);
    }
}
