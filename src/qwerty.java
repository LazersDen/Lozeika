import java.util.Scanner;

public class qwerty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ДОМОФОН ВАС ПРИВЕСТВУЕТ ВЕДИТЕ ВАШ НОМЕР КВАРТИРЫ");
        int q = in.nextByte();
        if (q >= 1 && q <= 20) {
            System.out.println("Вы пожеваете в 1 подезде в квартире номер " + q);
        }
        if (q >= 21 && q <= 48) {
            System.out.println("Вы пожеваете в 2 подезде в квартире номер " + q);
        }
        if (q >= 49 && q <= 90) {
            System.out.println("Вы пожеваете в 3 подезде в квартире номер " + q);
        }


    }
}


