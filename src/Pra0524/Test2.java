package Pra0524;

import java.math.BigInteger;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        BigInteger[] arr=new BigInteger[100001];
        arr[1]= BigInteger.valueOf(1);
        arr[2]=BigInteger.valueOf(2);
        for(int i=3;i<arr.length;i++){
            arr[i]=arr[i-1].add(arr[i-2]);
        }
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n<1||n>100000){
                continue;
            }
            if(arr[n].compareTo(BigInteger.valueOf(100000))<0){
                System.out.println(arr[n]);
            }else{
                String str=arr[n]+"";
                System.out.println(str.substring(str.length()-6,str.length()));
            }
        }
    }
}
