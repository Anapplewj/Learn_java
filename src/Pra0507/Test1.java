package Pra0507;

import java.util.*;

public class Test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            String[] arr=input.split("-");
            String arr2="34567891JQKA2";
            if(arr[0].equals("joker JOKER")||arr[1].equals("joker JOKER")){
                System.out.println("joker JOKER");
                continue;
            }else if(arr[0].length()==arr[1].length()||(arr[0].substring(0,1).equals("1"))||(arr[1].substring(0,1).equals("1"))){
                if(arr2.indexOf(arr[0].substring(0,1))>arr2.indexOf(arr[1].substring(0,1))){
                    System.out.println(arr[0]);
                }else{
                    System.out.println(arr[1]);
                }
            }else if(arr[0].length()==7){
                System.out.println(arr[0]);
            }else if(arr[1].length()==7){
                System.out.println(arr[1]);
            }else{
                System.out.println("ERROR");
            }
        }
    }
}
