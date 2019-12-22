import java.util.Random;
import java.util.Scanner;

public class Massive1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int maxValue = 0;
        int min = 100;
        int counter = 0;
        int max = 0;
        int minValue = 0;
        int sum = 0;
        int countOfValues = 10;

        int mass[] = new int[countOfValues];
        for (int i = 0; i < 10; i++) {
            int randValue = rnd.nextInt(201) - 100;
            mass[i] = randValue;
            if (randValue > i) {
                maxValue = randValue;
                max = i;
            }
            if (randValue < min) {
                min = randValue;
                minValue = i;
            }
            counter = counter + randValue;
            if (max < minValue) {
                max = minValue;
            }
            if (minValue > max) {
                minValue = max;
            }
            for (int d = minValue; d < max; d++) {
                sum = mass[d] + sum;
            }

            System.out.println("Массив пунткт масива № " + i + " Число что в нем лежит = " + mass[i]);
        }

        System.out.println("Максимальное число массива = " + maxValue + " Место в массиве = " + max);
        System.out.println("Минимальное число массива = " + min + " Место в массиве = " + minValue);
        counter = counter / countOfValues;
        System.out.println("Среднее арифмитическое масива = " + counter);
        System.out.println("Сума я чеек между мин и мах числами = " + sum);

    }
}
