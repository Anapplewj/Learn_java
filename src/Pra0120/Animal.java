package Pra0120;

public class Animal {
    String name;
    public Animal(String name){
        this.name=name;
    }

    public void eat(String food){
        System.out.println(name+"正在吃"+food);
    }
}
