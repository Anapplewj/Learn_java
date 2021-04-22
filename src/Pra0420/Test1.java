package Pra0420;

import java.util.Scanner;

//求a和b的最小公倍数
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<=0||b<=0){
                System.out.println(0);
            }
            //保证a里面放的是两个数中较大的那个数
            if(a<b){
                int temp=a;
                a=b;
                b=temp;
            }
            int i=1;
            int result=a;
            while((result%b!=0)){
                i++;
                result=a*i;
            }
            System.out.println(result);
        }
    }
}
