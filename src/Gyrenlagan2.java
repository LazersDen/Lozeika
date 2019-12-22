import java.util.Scanner;

public class Gyrenlagan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int q = 0; q < 11; q++) {
            int k =1;
            for (int j = 1; j < q; j++) {
                k = k*2;
            }
            System.out.print(k+" ");
        }
    }
}

