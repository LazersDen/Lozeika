import java.util.Arrays;
import java.util.Random;

public class Lift {
    public static void main(String[] args) {
        Random rnd = new Random();
        int q[] = new int[20];
        int r = 0;
        int counter = 0;
        int lift = 0;
        for (int i = 0; i < q.length; i++) {
            int x = rnd.nextInt(80) + 40;
            q[i] = x;
        }

        System.out.println(Arrays.toString(q));


        for (int e = 0; e < q.length; e++) {


            while (counter < q.length) {
                if (r + q[counter] < 400) {
                    r += q[counter];
                    System.out.print( q[counter]+ " ");
                    q[counter] = 0;

                } else {
                    System.out.println();
                    r = 0;
                    lift++;
                    break;
                }
                counter++;
            }
        }
        System.out.println(lift);

    }
}