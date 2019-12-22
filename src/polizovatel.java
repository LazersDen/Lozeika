import java.util.Random;
import java.util.Scanner;

public class polizovatel {
public static  void main (String[]args){
    Scanner in =new Scanner(System.in);
    Random rnd =new Random();
    System.out.println("Ведите число\n");
    int q=in.nextInt();
    int r[]=new int[q];
    for (int e=0;e<q;e++){
        int x=rnd.nextInt(100);
        r[e]=x;
        System.out.println(r[e]+"\n");
    }


}
}
