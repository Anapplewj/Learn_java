package Pra0509;

import java.util.Scanner;
import java.util.Stack;
//未完成
//两个字符串的最长公共子串
//如何确定是最长的呢?将所有子串保存在栈中,长度最长的存入,最后取栈顶元素
//也就是将字符串的起始和终点记录下来?
public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            if(str1.length()==0||str2.length()==0){
                continue;
            }
            //保证str1中存的是最长的那个字符串
            String temp=(str1.length()>str2.length())?str1:str2;
            str2=(str1.length()<str2.length())?str1:str2;
            str1=temp;
            Stack<String> stack=new Stack<>();
            int flag=0;
            for(int i=0;i< str1.length();i++){
                char ch1=str1.charAt(i);
                int j=flag;
                for(;j<str2.length();j++){
                    char ch2=str2.charAt(j);
                    if(ch1!=ch2){
                        j++;
                    }
                }
                if(j!=0){
                    if(stack.isEmpty()||stack.peek().length()<(j-i+1)){
                        stack.push(str1.substring(i,j+1));
                    }
                }
                flag=j;
            }
            if(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
        }
    }
}
