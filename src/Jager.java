import java.util.Random;
import java.util.Scanner;

public class Jager {public static void  main(String[]args){
    Scanner in =new Scanner(System.in);
    Random rnd= new Random();
    for (int q=0;true;q++){

        for(int j =0; j<1000;j++)
        {
            int w=rnd.nextInt(2);
            switch (w) {
                case 0:System.out.print(" ↑ ");break;
                case 1: System.out.print(" ↓  ");
            }
        }
        System.out.println("");
    }
}
}
