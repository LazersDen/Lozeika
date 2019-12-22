import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float w=0;
        float r = 0;
        int t = 0;
        System.out.print("Ведите сколько тысяц рублец получить под 20%\n");
        float q = in.nextInt();
        w = (q/100*20);
        System.out.print("Число которое должен привысить долг\n ");
        int e = in.nextInt();
        while (true) {
            r = w + r;
            t++;
            if (r>e){break;}


    }System.out.print("Ващ долг привысит "+e+" через "+t+" лет");


}
}
