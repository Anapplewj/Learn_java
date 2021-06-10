package Pra0609;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                print(num);
            }
        }
    }

    private static void print(int num){
        if(num%2!=0){
            System.out.println(-1);
        }
        int ret=num;//表示剩余的数字
        int count=0;
        while (ret>=2){
            for(int i=1;i<num;i++){
                if(count%(2<<i)==0){
                    
                }
            }
        }
    }
}
