import java.util.Scanner;

public class fil {public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    System.out.println("Ведите число");
    int e=0;
    int q=in.nextInt();
    for (int w=0;w<q;w++){
        if(w % 2 > 0){e=w+e;
        }
    }System.out.println(e);
}
}
