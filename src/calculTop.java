import java.util.Scanner;

public class calculTop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите 1 число");
        int x = in.nextInt();
        System.out.println("Ведите 2 число");
        int v = in.nextInt();
        System.out.println("Выберите функцию\n 1- Cложение \n 2- Вычетание \n 3- Умножение \n 4- Деление  \n 0-Закрать програму  \n");
        int w = in.nextInt();
       if (w==0){
           System.out.println("ПРОГРАМА ЗАКРЫТА");
       }if (w==1){
           System.out.println("Ответ = " + (x + v));
        }if (w==2){
            System.out.println("");
        }
    }

}

