import java.util.Scanner;

public class Joke {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for (int q=0;true;q++) {
            System.out.println("X");
            int x = in.nextInt();
            System.out.println("Y");
            int y = in.nextInt();
            Mean(x,y);
            System.out.println("Выйти ? 1=+ 2=-");
            int w=in.nextInt();
            if (w==1){
                break;
            }

        }
    }
    public static void Mean(int x ,int y ){
        int AMean=(x+y)/2;
        System.out.println("AMean "+AMean);
        int GMean=x*y;
       double u = Math.sqrt(GMean);

        System.out.println("GMean "+u);

    }
}
