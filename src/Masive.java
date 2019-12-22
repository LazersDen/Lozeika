import java.util.Random;
import java.util.Scanner;

public class Masive {
    public static void main(String[] args) {
        Random rnd=new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите количевство счетов");
        int t=1;
        int y=111;
        int u=0;
        int r=in.nextInt();
        int q[] = new int[r];
        for (int w=0;w<r;w++){
            int e=rnd.nextInt(101);
            q[w]=e;
            if (t<e){
                t=e;
            }if (y>e){
                y=e;
            }u=e+u;
        //System.out.println(e);

    }    System.out.print("Наибольшие число= "+t+"\n Наименьшее= "+y+"\n Вся сума на считах= "+u);


    }
}
