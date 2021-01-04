import java.util.Arrays;
import java.util.Scanner;

public class pra1220 {
    public static void main(String[] args) {
        //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
        int[] arr={9,5,9,2,5,7,7,7,2,6,3,3};
        String result=Arrays.toString(arr);
        System.out.print(result+"中只出现一次的数字是：");
        findNum(arr);
    }

    public static void findNum(int[] arr) {
        for(int cur=0;cur<arr.length;cur++){
            int find=0;
            for(;find<arr.length;find++){
                if(find!=cur&&arr[find]==arr[cur]){
                    break;
                }
            }
            if(find==arr.length){
                System.out.println(arr[cur]);
                break;
            }
        }
    }
}
//    public static void main(String[] args) {
//        //求1！+2！+3！+4！+........+n!的和
//        System.out.println("请输入一个数字:");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        System.out.println("阶乘求和是："+factorialSum(num));
//    }
//
//    public static int factorialSum(int num) {
//        int result=0;
//        for(int i=1;i<=num;i++){
//            result+=factorial(i);
//        }
//        return result;
//    }
//        public static int factorial(int num) {
//        int result=1;
//        for(int i=1;i<=num;i++){
//            result*=i;
//        }
//        return result;
//    }
//}
//    public static void main(String[] args) {
//        //求 N 的阶乘
//        System.out.println("请输入一个数字:");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        System.out.println(num+"的阶乘是："+factorial(num));
//    }
//
//    public static int factorial(int num) {
//        int result=1;
//        for(int i=1;i<=num;i++){
//            result*=i;
//        }
//        return result;
//    }
//}
//    public static void main(String[] args) {
//        //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
//        //int[] arr={2,4,9,7,6,5};
//        int[] arr={2,3,3,2,0};
//        System.out.print("Before change:");
//        String result1= Arrays.toString(arr);
//        System.out.println(result1);
//        change(arr);
//        System.out.print("After  change:");
//        String result2= Arrays.toString(arr);
//        System.out.println(result2);
//    }
//
//    public static void change(int[] arr) {
//        int temp=0;
//        //外层循环控制趟数，有几个元素执行几趟，每一趟都交换一个
//        //内层循环寻找
//        for(int even=0;even<arr.length;even++){
//            if(arr[even]%2==0){
//                for(int odd=even+1;odd<arr.length;odd++){
//                    if(arr[odd]%2!=0){
//                        temp=arr[odd];
//                        arr[odd]=arr[even];
//                        arr[even]=temp;
//                        break;
//                    }
//                }
//            }
//        }
//    }
//
//}
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
