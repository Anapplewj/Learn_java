package Pra0120;

public class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public void fly(){
        System.out.println(name+"正在飞");
    }
}
