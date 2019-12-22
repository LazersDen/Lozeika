package PolosaooPripastwiii;

public class Main {
    public static void main(String[] args) {
        Pingvin Pingvins = new Pingvin("Игорь");
        //Pingvins.info();
        WAll Stena = new WAll("ИТиран");
        //Stena.info();
        Dog dog = new Dog("Leon");
        //dog.info();
        Rosamaxa rosamaxa = new Rosamaxa("Ololo");
        //rosamaxa.info();
        labirint Labirit = new labirint("gost");
        //Labirit.info();
        water water = new water("water");
       // water.info();
        new Thread() {
            public void run() {
                    Check0(Pingvins, Stena);
                    Check1(Pingvins, Labirit);
                    Check2(Pingvins, water);
                try {
                    Thread.sleep(Pingvins.speed);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            public void run() {
                    Check0(dog, Stena);
                    Check1(dog, Labirit);
                    Check2(dog, water);
                try {
                    Thread.sleep(dog.speed);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            public void run() {
                    Check0(rosamaxa, Stena);
                    Check1(rosamaxa, Labirit);
                    Check2(rosamaxa, water);
                try {
                    Thread.sleep(rosamaxa.speed);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();


    }


    public static boolean Check0(Animal x, Apstaicales y) {
        if (y.Visota < x.height && y.Hirina < x.hirina) {
            System.out.println(x.Name + " prochol");
        } else {
            System.out.println(x.Name + " nesmog");
            return false;
        }
        return true;
    }

    public static boolean Check1(Animal x, Apstaicales y) {
        if (y.Intel < x.Intel) {
            System.out.println(x.Name + " prochol");
        } else {
            System.out.println(x.Name + " nesmog");
            return false;
        }
        return true;
    }

    public static boolean Check2(Animal x, Apstaicales y) {
        if (x.water) {
            System.out.println(x.Name + " prochol");
        } else {
            System.out.println(x.Name + " nesmog");
            return false;
        }
        return true;
    }

}