package Pra0514;

import java.util.*;

public class Test2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int zu=0;
        if(zu==0){
            zu=sc.nextInt();
        }
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] left=new int[n];
            int[] right=new int[n];
            for(int i=0;i<left.length;i++){
                left[i]=sc.nextInt();
            }
            for(int i=0;i<right.length;i++){
                right[i]=sc.nextInt();
            }
            int[] temp=new int[2*n];
            while(k!=0){
                temp=shuffle(left,right);
                k--;
                int l=0;
                int r=0;
                for(int i=0;i<temp.length;i++){
                    if(i<n){
                        left[l]=temp[i];
                        l++;
                    }else{
                        right[r]=temp[i];
                        r++;
                    }
                }
            }
            for(int i=0;i<temp.length;i++){
                if(i!=temp.length-1){
                    System.out.print(temp[i]+" ");
                }else{
                    System.out.println(temp[i]);
                }
            }
        }
    }
    private static int[] shuffle(int[] left,int[] right){
        int[] temp=new int[left.length+right.length];
        int l=0;
        int r=0;
        int i=0;
        while(r<right.length&&i<temp.length){
            if(i%2==0){
                temp[i]=left[l];
                l++;
            }else{
                temp[i]=right[r];
                r++;
            }
            i++;
        }
        return temp;
    }
}
