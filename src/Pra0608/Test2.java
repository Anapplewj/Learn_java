package Pra0608;

import java.util.*;

public class Test2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            StringBuilder res=new StringBuilder();
            for(int i=0;i<input.length();i++){
                char ch=input.charAt(i);
                if(ch=='_'&&i+1<input.length()&&input.charAt(i+1)<'z'&&input.charAt(i+1)>'a'){
                    res.append((input.charAt(i+1)+"").toUpperCase());
                    i++;
                }else{
                    res.append(ch);
                }
            }
            System.out.println(res);
        }
    }
}