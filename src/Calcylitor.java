import java.util.Scanner;

public class Calcylitor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберете операцию\n1- Калькулятор\n2- Сравниватель чисел\n3- Выход  \n ");
        int a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Ведите 1 число");
                int x = in.nextInt();
                System.out.println("Ведите 2 число");
                int v = in.nextInt();
                System.out.print("Выберите функцию\n 1- Cложение \n 2- Вычетание \n 3- Умножение \n 4- Деление  \n ");
                int c = in.nextInt();
                switch (c) {
                    case 1:
                        System.out.print("Ответ = " + (x + v));
                        break;
                    case 2:
                        System.out.print("Ответ = " + (x - v));
                        break;
                    case 3:
                        System.out.print("Ответ = " + (x * v));
                        break;
                    case 4:
                        System.out.print("Ответ = " + (x / v));
                        break;
                    default:
                        System.out.print("Ведено неверное число");
                        break;
                }
                break;

            case 2:
                System.out.println("Ведите 1 число");
                int h = in.nextInt();
                System.out.println("Ведите 2 число");
                int l = in.nextInt();
                int num1 = h;
                int num2 = l;
                if (num1 > num2) {
                    System.out.println("Первое число больше Второго");

                }
                if (num1 < num2) {
                    System.out.println("Второе число больше Первого");
                    break;
                }
                if (num1 == num2) {
                    System.out.println("Второе число равно Первову");
                    break;
                }


            case 3:
                System.out.println("ВЫ ВЫШЛИ ИЗ ПРОГРАМЫ \n НАЖМИТН НА ЗЕЛЕНУЮ СТРЕЛОЧКУ ЧТОБЫ ПЕРЕЗАПУСТИТЬ ПРОГРАМУ ");
                break;
            default:
                System.out.println("ERROR \n Ведено неверное число");
                break;

        }

    }

}

