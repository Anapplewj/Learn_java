package Pra0129;

import java.util.Scanner;

public class HomeWork {
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    //如：1729 即1+7+2+9
    public static void main(String[] args) {
        System.out.println(func(1729));
    }

    private static int func(int num) {
        if(num/10==0){
            return num;
        }
        return num%10+func(num/10);
    }
}
//    public static void main(String[] args) {
//        System.out.println(diGui(5));
//    }
//    //递归求 N 的阶乘
//    private static int diGui(int num) {
//        if(num==1){
//            return 1;
//        }
//        return num*diGui(num-1);
//    }
//}
//    public static void main(String[] args) {
//        System.out.println(func(10));
//
//    }
//    //递归求 1 + 2 + 3 + ... + 10
//    private static int func(int num) {
//        if(num==1){
//            return 1;
//        }
//        return num+func(num-1);
//    }
//}
//    //递归求斐波那契数列的第 N 项
//    public static void main(String[] args) {
//        System.out.println("求斐波那契数列的第N项，请输入数字N");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        System.out.println("结果为："+fib(num));
//
//
//    }
//
//    private static int fib(int num) {
//        if(num==1||num==2){
//            return 1;
//        }
//        return fib(num-1)+fib(num-2);
//    }
//}
