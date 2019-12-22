import java.util.Random;

public class mnelili2<r> {
    public static void main(String[] args) {
        Random rnd = new Random();
        int q[] = new int[10];
        int r = 0;
        int t = 0;
        int v = -100;
        for (int e = 0; e < 10; e++) {
            int w = rnd.nextInt(5);
            q[e] = w;
            System.out.println("Массив пунткт масива № " + e + " Число что в нем лежит = " + q[e]);

            if (q[e] != v) {
                v = q[e];
            }
            if (q[e] == v) {
                r = q[e];
                t = v;
            }
        }
        System.out.println("1 число = " + r + " 2 число = " + t);

    }
}




