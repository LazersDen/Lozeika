import java.util.Random;
import java.util.Scanner;

public class GAMErandom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int q = rnd.nextInt(11);
        int w = 0;
        System.out.println("Выберите Уровень сложности \n1=Легко \n2=Ультрохардкор \n3=Угадай квадрат");
        int r = in.nextInt();
        if (r == 1) {
            int t = 0;
            while (true) {
                System.out.println("Ведите число 0-10");
                int e = in.nextInt();
                w++;

                if (q == e) {
                    System.out.println("Поздравляю вы выйграли" + w + "Попытки");
                    break;
                }
                if (q < e) {
                    System.out.println("Вы Проиграли число было меньше чем вы вели \n " + q);
                    t = t + 1;
                }
                if (q > e) {
                    System.out.println("Вы Проиграли число было больше чем вы вели \n" + q);
                    t = t + 1;
                    if (t == 10) {
                        System.out.println("Вы произвели " + w + " Попыток" + "\nGAME OVER");
                        break;
                    }


                }
            }

        }
        if (r == 2) {
            int t = 0;
            while (true) {
                System.out.println("Ведите число 0-10");
                int e = in.nextInt();
                w++;

                if (q == e) {
                    System.out.println("Поздравляю вы выйграли" + w + "Попытки");
                    break;
                }
                if (q < e) {
                    System.out.println("Вы Проиграли число было меньше чем вы вели \n " + q);
                    t = t + 1;
                }
                if (q > e) {
                    System.out.println("Вы Проиграли число было больше чем вы вели \n" + q);
                    t = t + 1;


                }
                if (t == 3) {
                    System.out.println("Вы произвели " + w + " Попыток" + "\nGAME OVER");
                    break;
                }
            }
        }
        if (r == 3) {
            int t = 0;
            int e = q * q;
            while (true) {
                System.out.println("Это квадрат какого числа ?" + e);
                int b = in.nextInt();
                if (q == b) {
                    System.out.println("Вы выйграли " + t + " Ваше число попыток");
                    break;
                }
                if (q < b) {
                    System.out.println("Вы Проиграли число было меньше чем вы вели \n " + q);
                    t = t + 1;
                }
                if (q > b) {
                    System.out.println("Вы Проиграли число было больше чем вы вели \n" + q);
                    t = t + 1;
                }
            }
        }
    }
}
