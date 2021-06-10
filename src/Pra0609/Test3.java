package Pra0609;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//先将所有的丑数计算出来
//然后按照下标去取
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr=new int[n];
            int count=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                count=Math.max(count,arr[i]);
            }
            List<Integer> list=new ArrayList<>();
            list.add(0);
            list.add(1);
            int num=2;
            while(list.size()<=count){
                if(isUglyNumber(num)){
                    list.add(num);
                }
                num++;
            }
            for(int i=0;i<arr.length;i++){
                if(i==arr.length-1){
                    System.out.println(list.get(arr[i]));
                }else{
                    System.out.print(list.get(arr[i])+"");
                }
            }
        }
    }
    private static boolean isUglyNumber(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                if(!(i==2||num==3||num==5)){
                    return false;
                }
            }
        }
        return num%2==0&&num%3==0&&num%5==0;
    }
}
