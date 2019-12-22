package Serdsi;

public class jj {
    String name;
    private int money;
    int id;
    public jj(){

    }
    public jj(String name, int money, int id){
        this.name=name;
        this.money=money;
        this.id=id;
    }

    public void INFO(){
        System.out.println(this.name+" "+this.money +" "+this.id);

    }
}
