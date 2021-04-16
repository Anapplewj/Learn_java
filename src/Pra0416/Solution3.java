package Pra0416;

import java.util.Scanner;
//a-b,b-c,a+b,b+c
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int r1=sc.nextInt();
            int r2=sc.nextInt();
            int r3=sc.nextInt();
            int r4=sc.nextInt();
            isRight(r1,r2,r3,r4);
        }
    }
    private static void isRight(int r1,int r2,int r3,int r4){
        double a=(double)(r1+r3)/2;
        double b=(double)(r2+r4)/2;
        double c1=(b-r2);
        double c2=(r4-b);
        if(((a+b-r3)<0.000000001)&&((a-b-r1)<0.000000001)&&(c1-c2<0.000000001)){
            System.out.println((int)a+" "+(int)b+" "+(int)c1);
        }else{
            System.out.println("No");
        }
    }
}
