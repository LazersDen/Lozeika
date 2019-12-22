import java.util.Scanner;

public class mlp {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Ведите параметры коробки \n Высота \n Ширина \n Длина");
        int q=in.nextInt();
        int w=in.nextInt();
        int e=in.nextInt();
        System.out.println("Ведите параметры Окна \n Высота \n Ширина");
        int r=in.nextInt();
        int t=in.nextInt();
        if ((q<=r&&q<=t)||(w<=r&&w<=t)||(e<=r&&e<=t)){
        System.out.println("Коробка пройдет в окно");}else System.out.println("Корбка непройдет а окно \n YOU SHALL NOT PASS !!!");


        }


    }

