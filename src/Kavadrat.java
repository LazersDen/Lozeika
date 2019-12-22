import java.util.Scanner;

public class Kavadrat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число");
        int q = in.nextInt();
        int k = Kva(q);
        System.out.println(k);
        System.out.println("Ведите Высоту");
        int t = in.nextInt();
        System.out.println("Ведите длину");
        int y = in.nextInt();
        int u = Cloz(t, y);
        System.out.println(u);
        System.out.println("Ведите a \n Ведите b \n Ведите c");
        int s = in.nextInt();
        int d = in.nextInt();
        int f = in.nextInt();
        int h = formyla(s, d, f);
        System.out.println(h);
        System.out.println("Ведите Число \n Ведите Степень");
        int b = in.nextInt();
        int n = in.nextInt();
        int m = Step(b, n);
        System.out.println(m);

    }

    static int Kva(int x) {
        int a = x * x;
        return a;
    }

    static int Cloz(int w, int r) {
        int e = (w + r) * 2;
        return e;
    }

    static int formyla(int a, int b, int c) {
        int q = ((Kva(a) + Kva(b)) / (a * b)) + c;
        return q;
    }

    static int Step(int a, int b) {
        int q = 1;
        for (int z = 0; z < b; z++) {
            q = q * a;
        }

        return q;
    }
}
