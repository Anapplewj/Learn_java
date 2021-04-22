package Pra0420;

import java.util.*;

public class Test5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n==0||n==1||n<0){
                System.out.println(0);
                continue;
            }
            System.out.println(steps(n));
        }
    }

    private static int steps(int n){
        int one=0;
        int two=1;
        int result=0;
        while(result<n){
            result=one+two;
            one=two;
            two=result;
        }
        return getMin(n-one,two-n);
    }

    private static int getMin(int i,int j){
        return i<j?i:j;
    }
}