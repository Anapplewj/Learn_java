package Pra0416;
import java.util.Scanner;
//错误的解法！！
//将字符串str2插入到str1中，判断是否为回文串，将每个位置都判断一遍
//判断有多少种插入方法
//public class Solution4 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            String str1=sc.nextLine();
//            String str2=sc.nextLine();
//            if(str1==null||str2==null){
//                System.out.println(0);
//            }
//            str1=str1.toLowerCase();
//            str2=str2.toLowerCase();
//            healp(str1,str2);
//        }
//    }
//
//    private static void healp(String str1,String str2){
//        if(str2.length()==0){
//            System.out.println(0);
//            return;
//        }else if(str1.length()==0){
//            StringBuilder result=new StringBuilder(str2);
//            if(isHui(result)){
//                System.out.println(1);
//            }else{
//                System.out.println(0);
//            }
//        }
//        int count=0;
//        StringBuilder result=new StringBuilder(str1+str2);
//        if(isHui(result)){
//            count++;
//        }
//        }
//
//
////        System.out.println(count);
//    }
//    //判断一个字符串是否为回文串,将其逆序之后，判断是否为相同的；
//    private static boolean isHui(StringBuilder result){
//        StringBuilder str=new StringBuilder(result.reverse());
//        if(result.toString().equals(str.toString())){
//            return true;
//        }
//        return false;
//    }
//}
