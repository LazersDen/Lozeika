import java.util.Scanner;

public class lolipop {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Ведите x \n Возмождные варианты x \n Отрицательные числа \n Число равное 7 \n Числа больше 10 \n   ");
        int x=in.nextInt();
        int num1=x;
        int num2=0;
        int num3=7;
        int num4=10;
        if (num1<num2){
            System.out.println("A = "+(x+15));
        }
        if (num1==num3){
            System.out.println("A = "+(x*x));
        }
        if (num1>num4){
            System.out.println("A = "+(x));
        }
        if (num1>=num2 && num3>num1 ){
            System.out.println("ERROR\nВЕДЕНО НЕ ВЕРНОЕ ЧИСЛО");
        }
        if (num1>num3 && num1<=num4 ){
            System.out.println("ERROR\nВЕДЕНО НЕ ВЕРНОЕ ЧИСЛО");
        }

    }
}
