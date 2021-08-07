package Pra0801;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] arr=input.split(",");
        String[] arr2=arr[arr.length-1].split(":");
        int size=Integer.parseInt(arr2[1]);
        int[] ret=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            ret[i]=Integer.parseInt(arr[i]);
        }
        double result=0;
        double prev=0;
        for(int i=size-1;i<ret.length;i++){
            double cur=0;
            for(int j=0;j<size;j++){
                cur=cur+ret[i-j];
            }
            //平均值
            cur/=size;
            if(prev==0){
                prev=cur;
                continue;
            }
            result= Math.max(((cur - prev) / prev), result);
            prev=cur;
        }
        String re=result*100+"";
        for(int i=0;i<re.length();i++){
            char ch=re.charAt(i);
            if(ch=='.'){
                System.out.println("."+re.charAt(i+1)+re.charAt(i+2)+"%");
                break;
            }else{
                System.out.print(ch);
            }
        }
    }
}
