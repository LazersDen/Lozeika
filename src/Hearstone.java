import java.util.Random;
import java.util.Scanner;

public class Hearstone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random kol = new Random();
        int z = kol.nextInt(11);
        System.out.println("Загадайте число \n от 0 до 10\n ");
        int x = in.nextInt();
        int numl = x;
        int num2 = z;

        if (numl < num2) {
            System.out.println("Ваше загаданое число небыло угадано \n было задано число меньше чем вы загадали  \n YOU WIN");
        }
        if (numl > num2) {
            System.out.println("Ваше загаданое число небыло угадано \n было задано число больше чем вы загадали\n YOU WIN");
        }
        if (numl == num2) {
            System.out.println("Ваше загаданое число было угадано \n YOU LOSE");
        }
        if (numl < 0 && numl > 10) {


        } else System.out.println("ВЫ ВЕЛИ НЕКОРЕТНОЕ ЧИСЛО");


    }
}