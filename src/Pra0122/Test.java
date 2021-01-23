package Pra0122;
class A{
    public int func(){
        System.out.println("A");
        return 0;
    }
}
class B extends A{
    @Override
    public int func(){
        System.out.println("B");
        return 0;
    }
}

public class Test {
    public static void main(String[] args) {
        A a=new A();
        A b=new B();
        a.func();
        b.func();
    }
}
