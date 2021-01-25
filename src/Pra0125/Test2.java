package Pra0125;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static int divide(int x,int y) throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException("此处抛出了一个算数异常");
        }
        return x/y;
    }
    public static void main(String[] args) {
        try{

            int ret=divide(10,0);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }

    }
}
//        //当try catch代码块执行完毕之后，就会自动针对sc进行关闭
//        try(Scanner sc=new Scanner(System.in)){
//            int num=sc.nextInt();
//            System.out.println(num);
//        }catch (InputMismatchException e){
//            System.out.println("输入类型不匹配异常");
//        }
//        try{
//            System.out.println("try中异常之前的代码");
//            int[] a={1,2,3};
//            System.out.println(a[100]);
//            System.out.println("try中异常之后的代码");
//        }catch(NullPointerException e){
//            System.out.println("catch中的代码");
//        }finally {
//            System.out.println("hello");
//        }
//    }
//}
