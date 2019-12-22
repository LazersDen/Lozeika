import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Masive2 {
    public static void main(String[] args) {
        int a[][] = new int[5][5];
         Random(a);
        Poisc(a);
    }

    static void Random(int a[][]) {
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                for (int e = 0; e < a.length; e++) {
                    int r = rnd.nextInt(30) + 30;
                    a[e][i] = r;
                    System.out.print(a[e][i] + " ");
                }
                System.out.println("");
            }
            if (i == 1) {
                for (int e = 0; e < a.length; e++) {
                    int r = rnd.nextInt(30) + 30;
                    a[e][i] = r;
                    System.out.print(a[e][i] + " ");
                }
                System.out.println("");
            }
            if (i == 2) {
                for (int e = 0; e < a.length; e++) {
                    int r = rnd.nextInt(30) + 30;
                    a[e][i] = r;
                    System.out.print(a[e][i] + " ");
                }
                System.out.println("");
            }
            if (i == 3) {
                for (int e = 0; e < a.length; e++) {
                    int r = rnd.nextInt(30) + 30;
                    a[e][i] = r;
                    System.out.print(a[e][i] + " ");
                }
                System.out.println("");
            }
            if (i == 4) {
                for (int e = 0; e < a.length; e++) {
                    int r = rnd.nextInt(30) + 30;
                    a[e][i] = r;
                    System.out.print(a[e][i] + " ");

                }
                System.out.println("");
            }


        }

    }

    static void Poisc(int a[][]) {
        int w = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                for (int e = 0; e < a.length; e++) {
                    if (a[e][i] > w) {
                        w = a[e][i];
                    }
                }
            }
            if (i == 1) {
                for (int e = 0; e < a.length; e++) {
                    if (a[e][i] >w) {
                        w = a[e][i];
                    }
                }
            }

            if (i == 2) {
                for (int e = 0; e < a.length; e++) {
                    if (a[e][i] > w) {
                        w = a[e][i];
                    }
                }
            }
            if (i == 3) {
                for (int e = 0; e < a.length; e++) {
                    if (a[e][i] > w) {
                        w = a[e][i];
                    }
                }
            }
            if (i == 4) {
                for (int e = 0; e < a.length; e++) {
                    if (a[e][i] > w) {
                        w = a[e][i];
                    }
                }
            }

        }
        System.out.println("Максимальное число "+w);
    }
}
