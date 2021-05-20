package Pra0520;

import java.util.Scanner;

//星际密码题目
public class Test2 {
    public static void main(String[] args) {
        //1. 提前计算好范围内的所有取值
        //注意Xi的取值范围为[1,10000]
        //也就是Xi的取值不可能为0,那么我们为了方便计算,舍弃掉arr[0]的位置
        //从arr[1]开始计算
        int[] arr=new int[10001];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<10001;i++){
            arr[i]=arr[i-1]+arr[i-2];
            arr[i]=arr[i]%10000;
        }
        //2. 根据输入直接取出来用
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int nums=sc.nextInt();
            StringBuilder result=new StringBuilder();
            for(int i=0;i<nums;i++){
                int xi=sc.nextInt();
                result.append(String.format("%04d",arr[xi]));
            }
            System.out.println(result);
        }
    }
}
