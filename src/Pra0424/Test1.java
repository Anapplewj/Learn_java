package Pra0424;

import java.util.*;
//首先将一个十进制数转化为二进制数的字符串
//然后进行插入操作
//再将其转为十进制
public class Test1{
    private static StringBuilder trans1(int num){
        boolean flag=false;
        if(num<0){
            flag=true;
            num=-num;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<32;i++){
            if(((1<<i)&num)==(1<<i)){
                result.append(1);
            }else{
                result.append(0);
            }
        }
        if(flag) {
            result.append(1);
        }
        return result.reverse();
    }
    public static int binInsert(int n, int m, int j, int i) {
        StringBuilder str1=trans1(n);
        StringBuilder str2=trans1(m);
        str2.delete(0,(32-(i+1)));
        System.out.println(str1);
        System.out.println(str2);
        //未完
        if(str2.length()>(i-j+1)){
            return 0;
        }
        str1.replace(32-(i+1),32-j,str2.toString());
        return trans2(str1);
    }
    private static int trans2(StringBuilder str){
        str.reverse();
        int result=0;
        int jie=1;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i==0){
                result+=Integer.parseInt(ch+"");
            }else{
                result+=Integer.parseInt(ch+"")*jie;
            }
            jie*=2;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(binInsert(16,4,0,2));
    }
}
