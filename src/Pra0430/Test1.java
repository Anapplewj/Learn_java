package Pra0430;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//找到n以内完全数的个数
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int count=0;
            for(int i=1;i<=n;i++){
                if(isWan(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    private static boolean isWan(int num){
        Set<Integer> set=new HashSet<>();
        for(int i=1;i<num;i++){
            if(num%i==0){
                set.add(i);
            }
        }
        int count=0;
        for(Integer x:set){
            count+=x;
        }
        if(count==num){
            return true;
        }
        return false;
    }
}
