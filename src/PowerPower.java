import java.util.Random;
public class PowerPower {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean a=true;
        int q = rnd.nextInt(10);
        System.out.println(q);
        int w = rnd.nextInt(151);
        System.out.println(w);
        a = isPover(a, q, w);
        if (a==true){
            System.out.println("Ok");
        }else System.out.println("not");
    }
    static boolean isPover(boolean a, int q, int w) {
        int e = 0;
        int r = 0;
        int t = 0;
        for (int i = 0; true; i++) {

                e = w % 10;
                w = w / 10;

                r = w % 10;
                w = w / 10;

                t = w % 10;
                w = w / 10;
            if (q == e && q == r && q == t) {
                a = true;
                return a;
            } else a = false;
            return a;
            }


        }

    static void Prosto(int q,int w){
        int e=0;
        int r=0;
        int t=0;
        for (int i=0;i<=3;i++){
            if(i==1){
                int a=w%10;
                if (a/2==0){
                    System.out.println(a+"prostoe");
                }else System.out.println(a+"Neprostoe");
            }
            if(i==2){
                int a=w%10;
                if (a/2==0){
                    System.out.println(a+"prostoe");
                }else System.out.println(a+"Neprostoe");
            }
        }
    }

}

