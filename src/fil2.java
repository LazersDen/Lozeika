import java.util.Scanner;

public class fil2 {public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int r=0;
    for (int q=1;q<10;q++){
        System.out.println("Ведите число от 0 до 1000 №"+q);
        int w=in.nextInt();
        if (w<r&&w%2==0&&w%3>0){r=w;}
    }System.out.println("Минимальное значение "+r);
}
}
