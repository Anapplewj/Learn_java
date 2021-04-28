package Pra0427;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            Arrays.sort(arr);
            HashSet<String> set=new HashSet<>();
            if(isLucky(arr)){
                set.add(arr.toString());
            }
            //每次操作完数组之后,都要将其还原回去,以便下一次的判断
            for(int i=0;i<arr.length;i++){
                
            }
        }
    }
    private static boolean isLucky(int[] arr){
        int count1=0;
        int count2=1;
        for(int x:arr){
            count1+=x;
            count2*=x;
        }
        if(count1==count2){
            return true;
        }
        return false;
    }
}
