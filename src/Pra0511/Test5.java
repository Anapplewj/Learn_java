package Pra0511;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//找出字符串中第一个只出现一次的字符串
public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.nextLine();
            Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<input.length();i++){
                char key=input.charAt(i);
                int value=map.getOrDefault(key,0);
                map.put(key,value+1);
            }
            boolean flag=false;
            for(int i=0;i<input.length();i++){
                char ch=input.charAt(i);
                if(map.get(ch)==1){
                    System.out.println(ch);
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println(-1);
            }
        }
    }
}
