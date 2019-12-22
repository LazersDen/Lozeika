import java.util.Scanner;

public class Proc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for (int i=0;true;i++) {
            System.out.println("Vedite cheslo");
            int r = in.nextInt();
            PoverA2(r);
            PoverA3(r);
            PoverA4(r);
            System.out.println("Выйти ? 1=+ 2=-");
            int w=in.nextInt();
            if (w==1){
                break;
            }
        }
    }
    public static void PoverA2(int r){
        int q=r*r;
        System.out.println("A2 "+q);
    }
    public static void PoverA3(int r){
        int q=r;
        for (int w=0;w<3;w++){
            q=r*q;
        }
        System.out.println("A3 "+q);
    }
    public static void PoverA4(int r){
        int q=r;
        for (int w=0;w<4;w++){
            q=r*q;
        }
        System.out.println("A4 "+q);

    }
}
