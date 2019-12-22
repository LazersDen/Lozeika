import java.util.Scanner;

public class fil3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ;
        for (int q = 1; q <= 100; q++) {
            int r = 0;
            for (int e = 1; e < q; e++) {
                if (q % e == 0) {
                    r = r + 1;
                }
                if (r == 2) {break;

                }
            }if (r==1){
                System.out.println(q);
            }

        }
    }
}