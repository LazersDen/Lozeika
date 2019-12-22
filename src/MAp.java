import java.util.HashMap;
import java.util.Random;

public class MAp {
    public static void main(String[] args) {
        Random rnd = new Random();
        HashMap<Integer,Integer> Minecraft = new HashMap<>();
        for (int i=0;i<=20;i++){
            int Stiv=rnd.nextInt(20)+1;
            Minecraft.put(i,Stiv);
        }
        HashMap<Integer,Integer>Olodyshek =new HashMap<>();
        for(int i=0;i<=20;i++){
            int Blin=rnd.nextInt(20)+1;
            Olodyshek.put(i,Blin);
        }
        for(int i=0;true;i++){
            int bit=0;
        }


    }
}
