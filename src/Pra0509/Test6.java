package Pra0509;

import java.util.*;
//未完...
public class Test6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1=sc.next();
            String str2=sc.next();
            if(str1==null||str2==null||str1.length()==0||str2.length()==0){
                System.out.println(0);
                continue;
            }
            String temp=(str1.length()>str2.length())?str1:str2;
            str2=(str1.length()<str2.length())?str1:str2;
            str1=temp;//保证str1中保存的是较长的那个字符串,str2中保存的是较短的那个字符串
            int max=0;
            for(int i=0;i<str2.length();i++){
                if(str1.contains(str2.substring(0,i))){
                    System.out.println(max);
                    break;
                }
            }
        }
    }
}
