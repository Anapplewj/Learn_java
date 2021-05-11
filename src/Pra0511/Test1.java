package Pra0511;

import java.util.Scanner;

//首先在于数据的处理
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.nextLine();
            String[] arr=input.split(" ");
//            System.out.println(shuffle(arr,1));
            shuffle(arr,1);
        }
    }
    private static String sum(String[] arr){
        int t=Integer.parseInt(arr[0]);
        int n=Integer.parseInt(arr[1]);
        int k=Integer.parseInt(arr[2]);
        int cur=2;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<t;i++){
            //将待洗的数组准备好
            String[] temp=new String[2*n];
            int now=0;
            //j表示arr数组的下标位置
            int j=cur+1;
            for(;j<2*n+cur+1;j++){
               temp[now]=arr[j];
            }
            //写一个函数,处理洗牌的功能
//            str.append(shuffle(temp,k));
            //更新变量
            if(i!=t-1){
                n=Integer.parseInt(arr[j+1]);
                k=Integer.parseInt(arr[j+2]);
                str.append(" ");
            }
        }
        return str.toString();
    }

    private static void shuffle(String[] temp,int k){
        String[] arr=new String[temp.length];
        while(k>0) {
            int right=arr.length-1;
            int left=arr.length/2-1;
            int i = 0;
            while (left >= 0) {
                arr[i] = arr[right];
                i++;
                right--;
                arr[i] = arr[left];
                i++;
                left++;
            }
            k--;
        }
        String result="";
        for(String x:arr){
            System.out.println(x);
        }
//        return result;
    }
}
