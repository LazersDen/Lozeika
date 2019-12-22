package PolosaooPripastwiii;

import java.util.Random;

public class Dog extends Animal{
    public Dog (String name) {
        Random rnd=  new Random();
        int q=rnd.nextInt(60)+1;
        int w= rnd.nextInt(50)+1;
        int e =rnd.nextInt(50)+1;
        int r=rnd.nextInt(100)+1;
        int t=rnd.nextInt(1000)+1;
        this.Name= name;
        fly = false;
        Mass = q;
        height = w;
        hirina = e;
        Intel=r;
        water =true;
        speed=t;
    }

}
