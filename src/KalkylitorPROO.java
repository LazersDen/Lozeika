import java.util.Scanner;

public class KalkylitorPROO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро Пожаловать \n Выберите операцию \n 1-Сложение \n 2-Вычитание \n 3-Умножение \n 4-Деление \n 5-Возведение в степень \n 6-Возведение в факториал");
        int q = in.nextInt();
        switch (q) {
            case 1: {
                System.out.println("Ведите 1-Число \n Ведите 2-число");
                int w = in.nextInt();
                int e = in.nextInt();
                int r = slohinie(w, e);
                System.out.println("Ваше Число =" + r);
            }
            break;
            case 2: {
                System.out.println("Ведите 1-Число \n Ведите 2-число");
                int w = in.nextInt();
                int e = in.nextInt();
                int r = vihitanie(w, e);
                System.out.println("Ваше Число =" + r);
            }
            break;
            case 3: {
                System.out.println("Ведите 1-Число \n Ведите 2-число");
                int w = in.nextInt();
                int e = in.nextInt();
                int r = ymnohinii(w, e);
                System.out.println("Ваше Число =" + r);
            }
            break;
            case 4: {
                System.out.println("Ведите 1-Число \n Ведите 2-число");
                int w = in.nextInt();
                int e = in.nextInt();
                int r = delini(w, e);
                System.out.println("Ваше Число =" + r);
            }
            break;
            case 5: {
                System.out.println("Ведите 1-Число \n Ведите 2-число");
                int w = in.nextInt();
                int e = in.nextInt();
                int r = Stepeni(w, e);
                System.out.println("Ваше Число =" + r);
            }
            break;
            case 6: {
                System.out.println("Ведите Число ");
                int a = in.nextInt();
               int e= factorial(a);
                System.out.println("Ваше Число =" + e);
            }
            break;
        }
    }

    static int slohinie(int a, int b) {
        int q = a + b;
        return q;
    }

    static int vihitanie(int a, int b) {
        int q = a - b;
        return q;
    }

    static int ymnohinii(int a, int b) {
        int q = a * b;
        return q;
    }

    static int delini(int a, int b) {
        int q = a / b;
        return q;
    }

    static int Stepeni(int a, int b) {
        int q = 1;
        for (int z = 0; z < b; z++) {
            q = q * a;
        }
        return q;
    }
    static int factorial(int a){
        int q=1;
        for (int w=1;w<=a;w++){
            q=w*q;
        }

       return q;
    }
}
