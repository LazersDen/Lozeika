import java.util.Random;
import java.util.Scanner;
public class sdwig1masiva {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int z = 0;
        System.out.println("Выберете количевство ячеек в массиве");
        int q = in.nextInt();
        int a[] = new int[q];
        int v[] = new int[q];
        for (int m = 0; m < q; m++) {
            int n = rnd.nextInt(50);
            a[m] = n;
            z = a[m];
            System.out.println("№ " + m + " массива " + " Его значение = " + n);
        }
        System.out.println("Ведите смещение массива из " + q);
        int c = in.nextInt();
        System.out.println(" ");
        for (int x = 0; x < c; x++) {
            for (int b = 0; b < q; b++) {
                if (b != q - 1) {
                    v[b + 1] = a[b];
                }
                a[b] = v[b];
                a[0] = z;
            }
        }
        for (int k = 0; k < q; k++) {
            System.out.println("№ " + k + " массива " + " Его значение = " + a[k]);
        }

    }
}

