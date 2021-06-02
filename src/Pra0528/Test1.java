package Pra0528;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        int[] arr=new int[21];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<arr.length;i++){
            arr[i]=arr[i-1]*i;
        }
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            double result=100-(1.0/arr[num])*100;
            String ret=String.valueOf(result);
            while(ret.indexOf(".")<2){
                ret="0"+ret;
            }
            while(ret.length()-ret.indexOf(".")<3){
                ret+="0";
            }
            while(ret.length()-ret.indexOf(".")>3){
                ret=ret.substring(0,5);
            }
            System.out.println(ret+"%");
        }
    }
}
