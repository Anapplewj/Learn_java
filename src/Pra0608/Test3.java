package Pra0608;

import java.util.*;
//首先将其输入到一个字符串中
//设置一个标记,isLetter表示是否为一个字母
public class Test3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            StringBuilder res=new StringBuilder();
            boolean isLetter=true;
            for(int i=0;i<input.length();i++){
                char ch=input.charAt(i);
                if(Character.isLetter(ch)){
                    isLetter=true;
                    res.append(ch);
                }else if(isLetter){
                    isLetter=false;
                    res.append(" ");
                }
            }
            String[] arr=res.toString().split(" ");
            for(int i=arr.length-1;i>=0;i--){
                if(i==0){
                    System.out.println(arr[i]);
                }else{
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}