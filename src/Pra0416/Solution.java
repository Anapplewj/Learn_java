package Pra0416;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    //输入一个数组,将其分为若干个长度为3的数组,最终输出每一组中第二大的元素的和
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int[] arr=new int[n*3];
            for(int i=0;i<n*3;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(healp(arr,n));
        }
    }
    private static long healp(int[] arr,int n){
        Arrays.sort(arr);
        long result=0;
        for(int i=0;i<n;i++){
            int index=arr.length-2*(i+1);
            result+=arr[index];
        }
        return result;
    }
}
