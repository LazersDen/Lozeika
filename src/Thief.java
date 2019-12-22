public class Thief {
    public static void main(String[] args) {


        new Thread() {
            public void run() {
                for (int x = 1; x < 50; x++) {
                    System.out.println(x);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
         new Thread() {
            public void run() {
                for (int c = 50; c <= 100; c++) {
                    System.out.println(c);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();


    }
}
