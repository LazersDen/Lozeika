
import java.util.Scanner;

public class xo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char data[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char ox[] = {'x', 'o'};
        boolean iswin = false;
        int countergame = 0;
        while (true) {
            int counterGraphics = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (j != 2) {
                        System.out.print(data[counterGraphics] + "|");
                    } else System.out.print(data[counterGraphics]);
                    counterGraphics++;
                }

                if (i != 2) {
                    System.out.println("\n-----");
                }
            }
            System.out.println("\n Выберите клетку ,в которой хотите поставить Z");
            int select = in.nextInt();
            if (select >= 1 && select <= 9) {
                if (countergame % 2 == 0) {
                    data[select - 1] = ox[0];
                } else data[select - 1] = ox[1];
                countergame++;
            } else System.out.println("Error");
            for (int r = 0; r < 3; r++) {
                if (data[r] == data[r + 2] && data[r + 6] == data[r + 3]) {
                    System.out.println("wIN");
                    iswin = true;

                }

                for (int f = 0; f < 3; f++) {
                    if (data[f] == data[f + 3] && data[f + 6] == data[f + 3]) {
                        System.out.println("wIN");
                        iswin = true;
                    }
                }

                if (data[0] == data[4] && data[4] == data[8]) {
                    System.out.println("wIN");
                    iswin = true;
                }
                if (data[2] == data[4] && data[4] == data[6]) {
                    System.out.println("wIN");
                    iswin = true;
                }
                if (iswin == true) {
                    break;
                }

            }
        }
    }}


