import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ведите 6-значное число");
        int q=in.nextInt();
        int w=(q%1000000/100000);
        int e=(q%100000/10000);
        int r=(q%10000/1000);
        int t=(q%1000/100);
        int y=(q%100/10);
        int u=(q%10);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);
        System.out.println(u);
int m=(w+e+r);
int b=(t+y+u);
if (m==b){System.out.println("Yes");}
else System.out.println("No");
    }
}
