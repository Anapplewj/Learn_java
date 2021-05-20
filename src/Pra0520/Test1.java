package Pra0520;

import java.util.Scanner;

//树根题目
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.nextLine();
            while(input.length()>1){
                int n=0;
                for(int i=0;i<input.length();i++){
                    n+=input.charAt(i)-'0';
                }
                input=String.valueOf(n);
            }
            System.out.println(input);
        }
    }
}
