import java.util.Scanner;

public class DZ1 {public static void main(String[]args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Ведите число \n");
    int q = in.nextInt();
    int e=1;
    for (int w=2;w<=q;w++){
        e=e*w;
    }System.out.print("Факториал ="+e);

}
}
