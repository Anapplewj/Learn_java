package Pra0120;
class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class Main extends X{
    Y y=new Y();
    public Main(){
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Main();
    }
}
//    public static void main(String[] args) {
//        Cat cat=new Cat("小狸花");
//        cat.jump();
//        cat.eat("鱼");
        //只有子类和父类之间才可以相互赋值
        //向上转型
//        Animal animal =null;
//        Cat cat=new Cat("小狸花");
//        animal=cat;
//        上面的代码等价于
//        Animal animal=new Cat("小狸花");
//    }
//}

