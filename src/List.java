import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите 0 или 1");
        Random rnd = new Random();
        ArrayList<Integer> xfhyufrt = new ArrayList<>();
        do {

            int EdinechkailNol = rnd.nextInt(11);
            xfhyufrt.add(EdinechkailNol);
            if (EdinechkailNol == 0) {
                System.out.println(xfhyufrt);
                break;
            }
            xfhyufrt.add(EdinechkailNol);

        } while (true);

        ArrayList<Integer> fdifj = new ArrayList<>();
        do {

            int cheso = rnd.nextInt(11);
            fdifj.add(cheso);
            if (cheso == 0) {
                System.out.println(fdifj);
                break;
            }


        } while (true);

        if (xfhyufrt.size() < fdifj.size()) {
            System.out.println("fdifj 2 win");

        }
        if (xfhyufrt.size() > fdifj.size()) {
            System.out.println("xfhyufrt 1 win");

        }
    }
}
