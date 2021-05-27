package Pra0526;

import java.util.*;

public class Test2{
    public static void main(String[] args){
        long[] arr=new long[100001];
        arr[0]=1;
        arr[1]=1;
        int border=-1;
        for(int i=2;i<arr.length;i++){
            long temp=arr[i-1]+arr[i-2];
            if(border==-1&&temp>=100000){
                border=i;
            }
            arr[i]=temp%1000000;
        }
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            if(num<border){
                System.out.println(arr[num]);
            }else{
                System.out.printf("%06d\n",arr[num]);
            }
        }
    }
}