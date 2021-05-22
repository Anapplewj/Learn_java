package Pra0521;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arr={'V','W','X','Y','Z','A','B','C','D','E','F','G',
                'H','I','J','K','L','M','N','O','P','Q','R','S','T','U'};
        while(sc.hasNextLine()){
            String input1=sc.nextLine();
            String input=input1.toUpperCase();
            StringBuilder result=new StringBuilder();
            for(int i=0;i<input.length();i++){
                char ch=input.charAt(i);
                if(!(ch>='A'&&ch<='Z')){
                    result.append(ch);
                    continue;
                }
                result.append(arr[ch-'A']);
            }
            System.out.println(result);
        }
    }
}
