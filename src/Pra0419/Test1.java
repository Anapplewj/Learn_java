package Pra0419;

//public abstract class Test1 {
//    public int a=5;
//    //a=a+5;这行代码是有问题的
//    //public abstract void method(int a);
//    public void method(){
//
//    }
//}
class Base{
    public Base(String s){
        System.out.println("B");
    }
}
public class Test1 extends Base{
    public Test1(String s){
        super(s);
        System.out.println("C");
    }

    public static void main(String[] args) {
        new Test1("D");
    }
}
//public class Test1{
//    public static void main(String[] args) {
//        //下面结果为true
////        String str1="he";
////        String str2="he";
////        System.out.println(str1==str2);
//        //下面结果为false
//        String str1="hello";
//        String str2="he"+ new String("llo");
//        System.out.println(str1==str2);
//    }
//}