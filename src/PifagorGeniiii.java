import java.util.Scanner;

public class PifagorGeniiii {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Числл" );
        int r=in.nextInt();
        int a[][] = new int[r][r];
        for (int q = 1; q < r; q++){
            for (int w = 1; w < r; w++) {
                a[q][w]=q*w;
                System.out.print(""+a[q][w]+"\t");
            }System.out.println("\t");
    }


}}

