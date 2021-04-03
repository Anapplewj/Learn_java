package Pra0402;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test2 {
    public static int count=0;
    public static void main(String args[]){
        Set<String> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        count=0;
        while(sc.hasNext()){
            String input=sc.nextLine();
            input=input.toUpperCase();
            String[] newStr=input.split(" ");
            for(String words:newStr){
                set.add(words);
            }
        }
        for(String key:set){
            count++;
        }
        System.out.println(count);
    }
}
