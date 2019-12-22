import java.util.Scanner;

public class lastcat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите операцию \n 1 = Перевести байты в килобайты \n 2 = Перевести килобайты в байты \n ");
        int q = in.nextInt();
        switch (q) {
            case 1:
                System.out.println("Ведите число \n ");
                int w = in.nextInt();
                System.out.println("Килобайт = " + (w * 1024));
                break;
            case 2:
                System.out.println("Ведите число \n ");
                int e = in.nextInt();
                System.out.println("Байт = " + (e / 1024));
                break;

            default:
                System.out.println("ERROR \n Вы вели неверно число");
        }

    }
}
