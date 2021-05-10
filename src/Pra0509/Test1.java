package Pra0509;

public class Test1 {
    int add(int a,int b){
        return add2(a,b);
    }
    int add2(int a,int b){
        return a+b;
    }
    //通过上面的两个方法可以看出,实例方法可以调用本类的实例方法.
    public static void main(String[] args) {

    }
}
