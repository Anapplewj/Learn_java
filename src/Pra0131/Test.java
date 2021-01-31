package Pra0131;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        //整数转字符串
//        int num=123;
//        String str1=num+"";
//        String str2=String.valueOf(num);
//        System.out.println(str1+str2);
//        //字符串转整数
//        String str3="456";
//        int num1=Integer.parseInt(str3);
//        System.out.println(num1);
//        //整型数组转字符串
//        int[] num2={1,2,3,4};
//        String str4= Arrays.toString(num2);
//        System.out.println(str4);
//        //数组拷贝
//        int[] num3={1,2,3,4};
//        int[] num4=Arrays.copyOf(num3,num3.length);
//        for(int x:num4){
//            System.out.println(x);
//        }
//        //字符串转字符数组
//        String str1="hahaha";
//        char[] ch1=str1.toCharArray();
//        for(char x: ch1){
//            System.out.println(x);
//        }
//        //字符数组转字符串
//        char[] ch2={'h','h'};
//        String str2=Arrays.toString(ch2);
//        String str3=new String(ch2);
//        System.out.println(str2+str3);
        //向{1，2，3，6，7}数组中插入4，5
        int[] num={1,2,3,6,7};
        StringBuffer str1=new StringBuffer(Arrays.toString(num));
        str1.insert(3,"4,5");
        System.out.println(str1);
    }
}
