import java.util.Scanner;

public class filip {public static void main(String[]args){
    Scanner in =new Scanner(System.in);
    System.out.println("Ведите количество повторений " );
    int w=in.nextInt();
    for (int q=1;q<w;q++){
        if (q==1){
            System.out.println("Я РОДИЛСЯ");
        }if (q==10){
            System.out.println("ПЕРВЫЙ ЮБИЛЕЙ");
        }if (q==50){
            System.out.println("ПЯТЫЙ ЮБИЛЕЙ");
        }if (q==99){
            System.out.println("OVER KILL");
        }
    }
}
}
