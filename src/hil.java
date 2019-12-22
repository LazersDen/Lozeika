import java.util.Scanner;

public class hil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите  X Y  \n");
        int x = in.nextInt();
        int y = in.nextInt();
        if (x >= 0 && y >= 0) {
            System.out.println("Вы Попали в 1 четверть");
        }if (x<0 &&0<=y){
            System.out.println("Вы Попали в 2 четверть"); }
        if (x>=0&&0>y){
            System.out.println("Вы Попали в 4 четверть");
        } if (x<0&&0>y){
            System.out.println("Вы Попали в 3 четверть");
        }




    }
}


