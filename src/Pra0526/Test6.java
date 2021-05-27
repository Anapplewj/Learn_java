package Pra0526;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=Integer.parseInt(sc.nextLine());
            String[] arr=new String[num];
            for(int i=0;i<num;i++){
                arr[i]=sc.nextLine();
                if(arr[i].contains(" ")||arr[i].contains(",")){
                    String temp="\""+arr[i]+"\"";
                    arr[i]=temp;
                }
            }
            for(int i=0;i<arr.length;i++){
                if(i==num-1){
                    System.out.println(arr[i]);
                }else{
                    System.out.print(arr[i]+", ");
                }
            }
        }
    }
}
