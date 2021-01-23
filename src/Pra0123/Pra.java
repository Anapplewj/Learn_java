package Pra0123;
class Animal{
    public void eat(String food){
        System.out.println("小动物正在吃"+food);
    }
}
class Cat extends Animal{
    @Override
    public void eat(String food){
        System.out.println("小猫正在吃"+food);
    }

}
public class Pra {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat("小鱼干");
    }
}

