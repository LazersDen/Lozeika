import java.util.Scanner;

public class Razrignie {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число");
        int q=in.nextInt();
        int w=0;
        while (true){
            q=q/10;
            w++;
            if (q<1){
                System.out.println("Ваше число является "+w+" Разрядным");
                break;
            }
        }


    }
}
