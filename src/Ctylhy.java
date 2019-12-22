import java.util.Scanner;

public class Ctylhy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ВЫБЕРИТЕ ФУНКЦИЮ \n ЗАПУСТИТЬ ПРОГРАМУ=любое число \n НЕ ЗАПУСКАТЬ ЕЁ=1");
        int m = in.nextByte();
        int v;
        for (v = 0; true; m++) {
            if (m == 1) {
                break;
            } else
                System.out.println("ВЫБЕРИТЕ ПУТЬ \n 1=ПОЙТИ ПРЯМО \n 2=ПОЙТИ ВЛЕВО \n 3=ПОЙТИ ВПРАВО \n ");
            int q = in.nextInt();
            switch (q) {
                case 1: {
                    System.out.println("1=посмотреть влево \n 2=посмотреть вправо");
                    int i = in.nextInt();
                    if (i == 1) {
                        System.out.println("ВЫ УВИДЕЛИ ОБЪЕКТ КАМУШЕК");
                    } else System.out.println("ВЫ УВИДЕЛИ NPS ЁЖИК");
                    break;
                }
                case 2: {
                    System.out.println("1=посмотреть вниз \n 2=посмотреть верх");
                    int p = in.nextByte();
                    if (p == 1) {
                        System.out.println("ВЫ УВИДЕЛИ ЯМУ В КОТОРУЮ ЧУТЬ НЕ УПАЛИ");
                    } else System.out.println("ВЫ УВИДЕЛИ ЛЕТЯЩИЙ ДЕРЕЖАБЫЛЬ");
                }
                break;
                case 3: {
                    System.out.println("ВЫ УВИДЕЛИ ПЕРЕД СОБОЙ ОЗЕРО \n 1=Кинуть в него камушек \n 2=Ничего не делать ");
                    int u = in.nextByte();
                    if (u == 1) {
                        System.out.println("ОЗЕРО ВЗОРВАЛОСЬ!!\n ПОЧЕМУ БЫ И НЕТ?");
                    } else System.out.println("ПОДОШЕЛ ЁЖИК И ДАЛ ВАМ СЕБЯ ПОГЛАДИТЬ");
                }
                break;
                default:
                    System.out.println("ВЫ ВЕЛИ НЕКОРЕТНОЕ ЧИСЛО");
            }
        }
    }
}
