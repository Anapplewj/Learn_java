package Pra0511;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int nums=sc.nextInt();
            int cur=sc.nextInt();
            int[] arr=new int[nums];
            for(int i=0;i<nums;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(sums(arr,cur));
        }
    }

    private static int sums(int[] arr,int cur){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=cur){
                cur+=arr[i];
            }else{
                cur+=yueShu(arr[i],cur);
            }
        }
        return cur;
    }

    private static int yueShu(int num1,int num2){
        for(int i=num2;i>=1;i--){
            if(num1%i==0&&num2%i==0){
                return i;
            }
        }
        return 0;
    }
}
