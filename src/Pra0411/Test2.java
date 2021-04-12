package Pra0411;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            int[] arr=new int[num*3];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
//            help(num,arr);
        }
    }
    //将输入的数据分为num组,每组三个人,那么如何分才能找到和最大的情况呢?
    //想不到好的方法,还是用暴力的方法吧
    static int result=0;

//    private static List<Integer> help(int num, int[] arr){
//
//    }
}
