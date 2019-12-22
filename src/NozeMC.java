import java.util.Scanner;

public class NozeMC {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Ведите реплику");
        String a =in.next();
    System.out.println("Ведите сколько говорить");
       int q= in.nextInt();
        test(q);
        System.out.println(" ");
        test(q,a);
    }

    public static void test(int a){
 for (int i=0;i<=a;i++){
     System.out.print("LOL"+"(_******_)");
 }
    }
    public static void test(int a,String s){
for (int i=0;i<=a;i++){
    System.out.println(s);
}
    }
}
