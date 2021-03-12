package Pra0312;

import java.util.Stack;

//输入两个字符比较是否相等，#表示退格字符
//创建两个栈，遍历两个字符，如果栈为空的时候，无操作
//栈不为空的时候，遇到#的时候出栈
//比较两个栈的长度是否相等，如果不相等返回false
//如果相等，一个一个出栈，比较是否相等
class Solution {
    public void set(Stack<Character> C,String str){
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(C.size()==0&&c=='#'){
                continue;
            }
            if(c=='#'){
                C.pop();
                continue;
            }
            C.push(c);
        }
    }

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> A=new Stack<>();
        Stack<Character> B=new Stack<>();
        set(A,S);
        set(B,T);
        if(A.size()!=B.size()){
            return false;
        }
        while(A.isEmpty()==false&&B.isEmpty()==false){
            char str1=A.pop();
            char str2=B.pop();
            if(str1!=str2){
                return false;
            }
        }
        return true;
    }
}
