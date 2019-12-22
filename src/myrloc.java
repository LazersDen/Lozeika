import java.util.Scanner;

public class myrloc {public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int r=0;
    System.out.println("Ведите число ");
    int q=in.nextInt();
    System.out.println("Ведите степень");
    int w=in.nextInt();
    for (int e=1;e<w;e++){
        q=q*q;
        System.out.println(q);
    }
}
}
