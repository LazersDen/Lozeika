package RAINENI;

import RAINENI.POST;

import java.util.Random;
import java.util.Scanner;


public class gLAV {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        POST DomQ[] = new POST[12];
        for (int i = 0; i < 12; i++) {
            int Nomer = rnd.nextInt(100) + 1;
            int Plochad = rnd.nextInt(100) + 30;
            int Komtan = rnd.nextInt(5) + 1;
            int Etach = rnd.nextInt(12);
            int Crok = rnd.nextInt(50) + 1;
            DomQ[i] = new POST(i, Nomer, Plochad, Etach, Komtan, "Pushkin", "Panelin", Crok);
          // DomQ[i].Info();
        }
        KolichestvoKomnat(DomQ);
        KolichestvoKomnatnaItache(DomQ);
        Plochid(DomQ);
        POST DomW[] = new POST[12];
        for (int i = 0; i < 12; i++) {
            int Nomer = rnd.nextInt(100) + 1;
            int Plochad = rnd.nextInt(100) + 30;
            int Komtan = rnd.nextInt(5) + 1;
            int Etach = rnd.nextInt(12);
            int Crok = rnd.nextInt(50) + 1;
            DomW[i] = new POST(i, Nomer, Plochad, Etach, Komtan, "Olegova", "Litai", Crok);
        }
        KolichestvoKomnat(DomW);
        KolichestvoKomnatnaItache(DomW);
        Plochid(DomW);


    }

    public static void KolichestvoKomnat(POST[] a) {
        System.out.println("Ведите Число Комнат");
        Scanner in = new Scanner(System.in);
        int Chislokomnat = in.nextInt();
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (Chislokomnat == a[i].Komnata) {
                a[i].Info();
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Неt Квартир стаким Количеством Комнат");
        }
    }

    public static void KolichestvoKomnatnaItache(POST[] a) {
        System.out.println("Этаж и комнаты");
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int Itach = in.nextInt();
        int Komnata = in.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (Komnata == a[i].Komnata && Itach >= a[i].Etach) {
                a[i].Info();
                counter++;
            }


        }
        if (counter == 0) {
            System.out.println("Неет Квартир стаким Количеством Комнат");
        }

    }

    public static void Plochid(POST[] a) {
        System.out.println("Ведите Площядь");
        Scanner in = new Scanner(System.in);
        int Plochid = in.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (Plochid < a[i].plochad) {
                a[i].Info();
            }
        }

    }
}


