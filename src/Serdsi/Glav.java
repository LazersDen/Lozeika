package Serdsi;

import java.util.Random;

public class Glav {
    public static void main(String[] args) {
        Random rnd = new Random();
        String gdd[] = {"Kosti", " Vani", "FAllolder", "TITANIC", "SOLIDER", "KNIGER", "LazersDen", "VAnilin", "LINGvIST", "HihiliN"};
        jj giveknot[] = new jj[10];
        for (int i = 0; i < giveknot.length; i++) {

            giveknot[i] = new jj(gdd[rnd.nextInt(10)],rnd.nextInt(99999),rnd.nextInt(59));
            giveknot[i].INFO();
        }


    }
}