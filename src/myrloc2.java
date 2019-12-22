import java.util.Scanner;

public class myrloc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = 0;
        int t = 1000000;
        int y = 1;
        System.out.println("Ведите количестово поситителей");
        int q = in.nextInt();
        for (int w = 1; w <= q; w++) {
            System.out.println("Ведите возраст поситителя №" + w);
            int e = in.nextInt();
            if (e > r) {
                r = e;
            }
            if (e < t) {
                t = e;
            }
           y=(t+r/q);


        } System.out.println(" Самый старший посетитель " + r + "\n Самый младший посититель " + t + "\n Средний Возраст " + y);



    }
}
