import java.util.Scanner;

public class giveknot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите 1 число  \n");
        int q = in.nextInt();
        System.out.println("Ведите 2 число  \n");
        int w = in.nextInt();
        int e = q / w;
        int r = q % w;
        if (0 == r) {
            System.out.println( "Число делится полностью  \nЧастное =" + e);
        }else System.out.println("число неделится полностью \nOcтаток = " +  r  + " Частное = " + e);


    }
}
