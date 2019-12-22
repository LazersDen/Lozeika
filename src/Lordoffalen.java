import java.util.Random;

public class Lordoffalen {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a[][] = new int[4][4];
        for (int q = 0; q < 4; q++) {
            for (int e = 0; e < 4; e++) {
                int w = rnd.nextInt(10);
                a[q][e] = w;
                System.out.print(" "+a[q][e]);
            }System.out.println(" ");

        }

    }
}
