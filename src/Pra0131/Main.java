package Pra0131;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int j=i+1;
            char m='0';
            for(;j<str.length();j++) {
                m = str.charAt(j);
                if (c!=m&&(!str2.contains(""+c))) {
                    str2+=c;
                    System.out.print(c);
                    break;
                }
            }
        }
        if(!str2.contains(""+str.charAt(str.length()-1))){
            System.out.print(str.charAt(str.length()-1));
        }

    }
}

