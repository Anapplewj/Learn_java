import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.Arrays;
import java.util.Scanner;

public class pra1220 {
    public static void main(String[] args) {
        //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
        //int[] arr={2,4,9,7,6,5};
        int[] arr={2,3,3,2,0};
        System.out.print("Before change:");
        String result1= Arrays.toString(arr);
        System.out.println(result1);
        change(arr);
        System.out.print("After  change:");
        String result2= Arrays.toString(arr);
        System.out.println(result2);
    }

    public static void change(int[] arr) {
        int temp=0;
        //外层循环控制趟数，有几个元素执行几趟，每一趟都交换一个
        //内层循环寻找
        for(int even=0;even<arr.length;even++){
            if(arr[even]%2==0){
                for(int odd=even+1;odd<arr.length;odd++){
                    if(arr[odd]%2!=0){
                        temp=arr[odd];
                        arr[odd]=arr[even];
                        arr[even]=temp;
                        break;
                    }
                }
            }
        }
    }

}
//    public static void main(String[] args) {
//        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3
//        System.out.println("9,10,7中的最大值为："+max3(9,10,7));
//    }
//    public static int max2(int num1,int num2){
//        if(num1>num2){
//            return num1;
//        }else{
//            return num2;
//        }
//    }
//    public static int max3(int num1,int num2,int num3){
//        return max2(max2(num1,num2),num3);
//    }
//}
//    public static void main(String[] args) {
//        //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
//        // 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
//        System.out.println("6和8中最大的是："+bigNum(4,8));
//        System.out.println("2.5和2.6中最大的是："+bigNum(2.5,2.6));
//        System.out.print("2.5，2.6和8的大小关系为：");
//        bigNum(2.5,2.6,8);
//    }
//    public static int bigNum(int num1,int num2){
//        if(num1>num2){
//            return num1;
//        }else{
//            return num2;
//        }
//    }
//    public static double bigNum(double num1,double num2){
//        if(num1>num2){
//            return num1;
//        }else {
//            return num2;
//        }
//    }
//    public static void bigNum(double num1,double num2,int num3){
//        double num4=bigNum(num1,num2);
//        double num5=num1<num2?num1:num2;
//        if(num4>num3){
//            System.out.print(num4+">"+num3+">"+num5);
//        }else if(num4<num3){
//            System.out.print(num3+">"+num4+">"+num5);
//        }
//    }
//}
//    public static void main(String[] args) {
//        //在同一个类中,分别定义求两个整数的方法
//        // 和 三个小数之和的方法。
//        // 并执行代码，求出结果
//        System.out.println("2+3="+sum(2,3));
//        System.out.println("2.5+2+3="+sum(2.5,2,3));
//
//    }
//
//    public static int sum(int num1,int num2) {
//        return num1+num2;
//    }
//    public static double sum(double num1,double num2,double num3){
//        return num1+num2+num3;
//    }
//
//}
