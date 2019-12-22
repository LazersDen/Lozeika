import java.util.Random;
import java.util.Scanner;
import java.util.*;

//ArithmeticException
//ArrayIndexOutOfBoundsException
//InputMismatchException
public class JOJO {
    public static void main(String[] args) {
        Random rnd = new Random();
        int q[] = new int[10];
        for (int i = 0; i < q.length; i++) {
            int w = rnd.nextInt(101);
            q[i] = w;
        }
        for (int b = 0; true; b++) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Выберите операцию \n 1=Поиск наибольшего элемента массива \n 2=Поиск наименьшего элемента массива \n 3=Средне арифмитическое массива \n 4=Сума всех чисел массива \n 5=Упорядочить массив \n 6=Обнулить массив \n 7=Заполнить массив случайными числами \n 8=Заполнить в ручную \n 9=Поделить числа \n 10=Вывести определенное количество массива \n 11=Выход \n ");
                int e = in.nextInt();
                switch (e) {
                    case 1:
                        Jonatan1(q);
                        break;
                    case 2:
                        Spidvagon2(q);
                        break;
                    case 3:
                        Dio3(q);
                        break;
                    case 4:
                        Chezari4(q);
                        break;
                    case 5:
                        Haman5(q);
                        break;
                    case 6:
                        Joske6(q);
                        break;
                    case 7:
                        Goldenwind7(q);
                        break;
                    case 8:
                        Ingdio8(q);
                        break;
                    case 9:
                        Polnoref9();
                        break;
                    case 10:
                        THEWORLD10(q);
                        break;
                }

                if (e == 11) {
                    break;
                }
                if (e >= 12) {
                    System.out.println("Выбирете другое число \n ");
                }
            } catch (InputMismatchException e) {
                System.out.print(" Вы вели некоретное число ");
                System.out.println(" \n ");
            }


        }
    }
    static void Jonatan1(int q[]) {
        int w = 1;
        for (int i = 0; i < +q.length; i++) {
            if (q[i] > w) {
                w = q[i];
            }
        }
        System.out.println("Максимальное число " + w + " \n ");
    }
    static void Spidvagon2(int q[]) {
        int w = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] < w) {
                w = q[i];
            }
        }
        System.out.println("Менлььншее число " + w + " \n ");
    }
    static void Dio3(int q[]) {
        int w = 0;
        int e = 0;
        for (int i = 0; i < q.length; i++) {
            e = q[i] + e;
        }
        w = e / q.length;
        System.out.println("Средние арифметическое " + w + " \n ");
    }
    static void Chezari4(int q[]) {
        int r = 0;
        for (int i = 0; i < q.length; i++) {
            r = q[i] + r;
        }
        System.out.println("Сума всего " + r + " \n ");
    }
    static void Haman5(int q[]) {
        for (int i = 0; i < q.length; i++) {
            q[i] = (int) (Math.random() * 100);
            System.out.print(q[i] + "  ");
        }
        System.out.print("\n orted: \n");

        Arrays.sort(q);

        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + "  ");
        }
        System.out.println(" \n ");
    }
    static void Joske6(int q[]) {
        for (int i = 0; i < q.length; i++) {
            q[i] = 0;
        }
        for (int e = 0; e < q.length; e++) {
            System.out.print(q[e]);
        }
        System.out.println(" \n ");
    }
    static void Goldenwind7(int q[]) {
        Random rnd = new Random();
        for (int i = 0; i < q.length; i++) {
            int w = rnd.nextInt(101);
            q[i] = w;
        }
        for (int e = 0; e < q.length; e++) {
            System.out.print(q[e]);
        }
        System.out.println(" \n ");
    }
    static void Ingdio8(int q[]) {
        for (int i = 0; i < q.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Ведите число");
            int w = in.nextInt();
            q[i] = w;
        }
        System.out.println(Arrays.toString(q));
        System.out.println(" \n ");
    }
    static void Polnoref9() {


        Scanner in = new Scanner(System.in);
        System.out.println("Ведите 1 число");
        int e = in.nextInt();
        System.out.println("Ведите 2 число");
        int r = in.nextInt();
        int y;
        try {
            y = e / r;
            System.out.println("Итог " + y + " \n ");
        } catch (ArrayIndexOutOfBoundsException el) {
            y = 0;
            System.out.println("Итог " + y + " \n ");
        }

    }
    static void THEWORLD10(int q[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число");
        int w = in.nextInt();
        for (int i = 0; i < w; i++) {
            try {
                System.out.print(q[i] + " ");
            } catch (ArithmeticException e) {
                System.out.println(" \n Вы вели число больше массива \n  Выведен весь массив");
                w = q.length;
            }
        }
        System.out.println(" \n ");
    }
}





