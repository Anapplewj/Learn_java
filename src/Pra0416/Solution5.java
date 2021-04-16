package Pra0416;

import java.util.Arrays;
import java.util.Scanner;

//求连续子数组的最大和
//错误的解法！！
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n<=0){
                return;
            }
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(n==1){
                System.out.println(arr[0]);
                return;
            }
            int result=healp(arr);
            System.out.println(result);
        }
    }
    private static int healp(int[] arr){
        int left=0;
        int right=1;
        int result=arr[left];
        int[] ha=new int[arr.length];
        int size=0;
        while(right<arr.length){
            if((result+arr[right])>result){
                result=result+arr[right];
                right++;
            }else{
                left++;
                right++;
            }
        }
        return result+1;
    }
}
