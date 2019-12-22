import java.util.Scanner;

public class Hilikpter {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("ведите число\n");
        int q = in.nextInt();
        for (int w = 1; w < q; w = w + 1) {
            if (w % 5 == 0||w%11==0 ) {
                System.out.println(w);
            }
        }


    }
}
