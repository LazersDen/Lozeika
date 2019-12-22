import java.util.Scanner;

public class Deponia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Привествуем вас в подземелье \n Ваша задача выбратся отсюда \n УДАЧИ!");
        System.out.println("Выберите путь \n1-влево \n3-вправо");
        int q = in.nextInt();
        for (int m = 0; true; m++) {
            if (q == 1) {
                System.out.println("Вы увидели огромные врота \n 1=Осмотреть эти Ворта\n 3=Толкнуть их");
                q = in.nextInt();
                if (q == 1) {
                    System.out.println("Вы увидели рычаг и дернули его\n От туда из проема появившегося Вышел ГОБЛИН\n 1=Поговорить с ним \n 2=Отолкнуть его отпрохода ");
                    q = in.nextInt();
                    if (q == 1) {
                        System.out.println("Вас ударили и вы потеряли сознание");
                        if (q == 2) {
                            System.out.println("вы увидели проход \n ВЫ ВЫБРАЛИСЬ !");break;
                        }

                    }
                }
                if (q == 3) {
                    System.out.println("Ворота начали падать \n6- отойти влево \n7-отойти вправо ");
                    q = in.nextInt();
                    if (q == 6) {
                        System.out.println("Вас прибило воротами \nВас ударило и вы потеряли сознание");
                    }
                    if (q == 7) {
                        System.out.println("Ворота упали на лево \n вы увидели свет \n  ВЫ ВЫБРАЛИСЬ !");break;
                    }

                }
            }
            if (q == 3) {
                System.out.println("Вы увидели как дерутся 2 дварфа \n 5-Разнять их (попытатся)\n 4 пройти дальше ");
                q = in.nextInt();
                if (q == 5) {
                    System.out.println("Вас расквасило \nВас ударили и вы потеряли сознание");
                }
            }
            if (q == 4) {
                System.out.println("Дварфы разбили стену и выувидели свет \nВЫ ВЫБРАЛИСЬ !");break;
            }
        }


    }
}

