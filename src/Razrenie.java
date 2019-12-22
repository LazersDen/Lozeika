import java.util.Scanner;

public class Razrenie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите дату рождения");
        int x = in.nextInt();
        if (x >= 2004 && x <= 2019) {
            System.out.println("!!!GET OUT!!!\n!!!ВХОД ВОСПРЕЩЕН!!!");
        }
        if (x >= 1000 && x <= 2003) {
            System.out.println("WELCOME\nДобро пожаловать!");
        }
    }
}
