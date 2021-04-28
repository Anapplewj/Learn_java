package Pra0428;

import java.util.Scanner;

//二进制中1的个数
public class Test1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            int count=0;
            for(int i=0;i<32;i++){
                if(((1<<i)&num)==1<<i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
