package Pra0123;
//组合的举例
class Teacher{
    String name;
    String subject;
}
class Student{
    String name;
    String num;
}
public class School{
    public Teacher[] teacher=new Teacher[2];
    public Student[] student=new Student[2];
}
//继承的举例
//class Animal{
//    String name;
//    public Animal(String name){
//        this.name=name;
//        System.out.println("Animal的构造方法");
//    }
//    public void eat(){
//        System.out.println(this.name+"正在吃");
//    }
//}
//class Cat extends Animal{
//    public Cat(String name){
//        super(name);
//        System.out.println("Cat的构造方法");
//    }
//    public void jump(){
//        System.out.println(this.name+"正在跳");
//    }
//}
//class Bird extends Animal{
//    public Bird(String name){
//        super(name);
//        System.out.println("Bird的构造方法");
//    }
//    public void fly(){
//        System.out.println(this.name+"正在飞");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        Cat cat=new Cat("小狸花");
//        cat.eat();
//        cat.jump();
//        Bird bird=new Bird("小鸟");
//        bird.eat();
//        bird.fly();
//    }
//}
//class Sugar{
//    String name;
//    public Sugar(String name){
//        this.name=name;
//    }
//    public void eated(){
//        System.out.println(this.name+"正在被吃");
//    }
//}
//class BrownSugar extends Sugar{
//    public BrownSugar(String name) {
//        super(name);
//    }
//}
//class BubbleGum extends Sugar{
//    public BubbleGum(String name){
//        super(name);
//    }
//    public void bubble(){
//        System.out.println(this.name+"可以吹泡泡");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        BrownSugar brownSugar=new BrownSugar("红糖");
//        BubbleGum  bubbleGum=new BubbleGum("大大泡泡糖");
//        bubbleGum.bubble();
//    }
//}
