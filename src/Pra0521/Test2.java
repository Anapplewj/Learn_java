package Pra0521;

import java.math.BigInteger;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a==0){
                break;
            }
            int nums=0;
            while(a>=2){
                nums++;
                a/=2;
            }
            System.out.println(nums);
        }
    }
}
