package Pra0413;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    //将一个字符串逆序,比如I like beijing. 逆序成为 beijing. i like.
    //借助栈来实现
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.nextLine();
            print(input);
        }
    }
    private static void print(String input){
        if(input.length()==0){
            return;
        }
        Stack<String> stack=new Stack<>();
        int index=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch==' '){
                stack.push(input.substring(index,i));
                index=i+1;
            }else if(i==input.length()-1){
                stack.push(input.substring(index,i+1));
            }
        }
        while(!stack.isEmpty()&&stack.size()!=1){
            System.out.print(stack.pop()+" ");
        }
        if(!stack.isEmpty()&&stack.size()==1){
            System.out.print(stack.pop());
        }
    }
}
