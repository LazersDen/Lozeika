package PolosaooPripastwiii;

import java.util.Random;

public class WAll extends Apstaicales {
    public WAll(String name){
        Random rnd=new Random();
        int q=rnd.nextInt(30)+1;
        int w=rnd.nextInt(30)+1;
        this.name=name;
        Visota=q;
        Hirina=w;
    }
}
