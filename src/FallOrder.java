import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FallOrder {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        for (int e = 0; e < 10; e++) {
            int q = rnd.nextInt(5) + 1;
            a[e] = q;
        }
        String x[] = {"Петровннин","Русских","Макаров","Латуга","Дубынин","Асланов","Баранов","Хунариков","Маркушин","Бондарев"};
        System.out.println("Ведите оценку любую оченку ");
        int w = in.nextInt();
        filtr(a, w, x);
    }

    static void filtr(int a[], int w, String x[]) {
        for (int q = 0; q < a.length; q++) {
            if (a[q]==w) {
                System.out.println(x[q]+"\n"+a[q]);
            }

        }
        System.out.println(Arrays.toString(x)+"\n"+ Arrays.toString(a));
    }

}
