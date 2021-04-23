package Pra0423;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            String[] s=input.split(" ");
            int n=Integer.parseInt(s[s.length-1]);
            int[] arr=new int[s.length-1];
            for(int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(s[i]);
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                if(i==n-1){
                    System.out.println(arr[i]);
                }else{
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}