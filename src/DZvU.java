import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DZvU {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vedite cheslo ");
        int q = in.nextInt();
        desit(q);
        System.out.println(" ");
dva(q);


    }

    static void desit(int a) {
        int q = 0;
        int w = 0;
        String x[] = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",};
        for (int i = 0; true; i++) {
            q = a / 16;
            w = a % 16;
            if (q <= 9) {
                System.out.print(q);
            }
            if (w <= 9) {
                System.out.print(w);
            }
            if (q > 9) {
                System.out.print(x[q]);
            }
            if (w > 9) {
                System.out.print(x[w]);
            }

            break;
        }


    }
    static void dva(int a){
        int q=0;
        int w=0;
        int s[]=new int[a];
        for (int i=0;i<s.length;i++){
            q=a/2;
            w=q%2;
            s[i]=w;
            System.out.print(s[i]);
            if (a<2){
                System.out.println();
                break;
            }
        }
    }
}
