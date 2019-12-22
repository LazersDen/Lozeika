import java.util.Scanner;

public class oker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Ведите 1 и 2 число");
        int Permanet =in.nextInt();
        int Remanet=in.nextInt();
        int Save=0;
        int Chec=0;
        while (Permanet>=  Remanet){
           Permanet=Permanet-Remanet;
            Chec++;
        }
        System.out.println(Chec+" "+Save);
    }
}
