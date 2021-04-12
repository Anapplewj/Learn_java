package Pra0411;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            String result=myPrint(str1,str2);
            System.out.println(result);
        }
    }
    private static String myPrint(String str1,String str2){
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str2.length();i++){
            set.add(str2.charAt(i));
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(set.contains(ch)){
                continue;
            }
            result.append(ch);
        }
        return result.toString();
    }
}
