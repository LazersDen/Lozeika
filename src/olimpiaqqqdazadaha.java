import java.util.Scanner;

public class olimpiaqqqdazadaha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите количество учеников");
        int w = in.nextInt();
        System.out.println("Ведите количесстово очеркиваний");
        int e = in.nextInt();
        int a[] = new int[w];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ведите длину прыжка");
            int c = in.nextInt();
            a[i] = c;
        }
        int f = 0;
        for (int o = 0; o < a.length; o++) {
            if (a[o] > f) {
                f = a[o];
                a[o] = f;
                o=0;
            }

        }

        for (int v = 0; v < e; v++) {
            System.out.print("   " + a[v]);
        }
        for (int v = 0; v < w; v++) {
            System.out.println("\n" + a[v]);
        }



    }
}








