package Pra0130;

class Base{
    public Base(String s){
        System.out.print("B");
    }
}
public class Derived extends Base{
    public Derived (String s) {
        super(s);//如果父类中的构造方法有参数，那么子类中必须传入参数
//        不然就会编译出错，使用super()的方式传参。
        System.out.print("D");
    }
    public static void main(String[] args){
        new Derived("C");
    }
}