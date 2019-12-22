


import java.util.Scanner;

public class destiny {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ведите целое число");
        int q = in.nextInt();
        int A = 65;
        int Z = 122;
        int a = 97;
        int z = 122;

        if ((q >= 65 && q <= 90) || (q >= 97 && q <= 122)) {
            char w = (char) q;
            System.out.println("Веден символ \n " + w);
        } else System.out.println("Веден иной символ");


    }

    {
    }
}
