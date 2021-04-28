package Pra0426;

import java.util.Scanner;
//从first这个台阶跳x步到达goal这个台阶
//x的计算方法为,找到x的最大公约数,不包含x和1
public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int first=sc.nextInt();
            int goal=sc.nextInt();
            int count=0;
            int cur=first;
            while(cur<goal){
                if(steps(cur)==0){
                    break;
                }
                cur=cur+steps(cur);
                count++;
            }
            if(cur<goal){
                System.out.println(0);
            }else {
                count++;
                System.out.println(count);
            }
        }
    }
    private static int steps(int cur){
        int len=cur/2;
        for(int i=len;i>1;i++){
            if(cur%i==0){
                return i;
            }
        }
        return 0;
    }
}
