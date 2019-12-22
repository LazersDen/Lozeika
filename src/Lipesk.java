import java.util.Scanner;

public class Lipesk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число");
        int q = in.nextInt();
        for (int w = 1; w < q; w++) {
            if(w%3==0) {
                System.out.println("Число делится на 3 ="  + (w));
            }
        }
    }

}

