import java.util.Random;
import java.util.Scanner;

public class mnelili {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int q[] = new int[10];
        int u[] = new int[10];
        int r = 0;
        int y = 0;
        int i=0;

        for (int e = 1; e < 10; e++) {
            boolean flag = true;
            int w = rnd.nextInt(20) - 10;
            q[e] = w;
            System.out.println("Массив пунткт масива № " + e + " Число что в нем лежит = " + q[e]);
            if (q[e] % 2 == 0) {
                r++;
            }
            for (int t = 0; t < e; t++) {
                if (q[e]==u[t]){
                    flag=false;
                    break;
                }

            }
            if (flag){
                u[y]=q[e];
                y++;
            }

        }
        System.out.println("Все четные числа = " + r + " уникальное чисел " + y);
    }
}

