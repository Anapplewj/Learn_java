package Pra0413;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//读入一个字符串str,输出其中最长的数字串
//例如: abcd1234feghrlss5678910
//思路:记录上一个子串的长度,记录起始和终止,终止(非数字的)-起始=子串的长度8-4=4
//遍历一遍数组直到最后,遇到大的才更新内容放在一个数组中,否则呢,直接取出起始和终止的
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.next();
            if(input.length()==0){
                return;
            }
            healp(input);
        }
    }
    private static void healp(String input){
        List<String> list=new ArrayList<>(); //将结果保存在list当中
        input=input.toUpperCase();
        for(int index=0;index<input.length();index++){
            char ch=input.charAt(index);
            if((ch>='0'&&ch<='9')){
                int last=index+1;
                for(;last<input.length();last++){
                    char ch2=input.charAt(last);
                    if(!(ch2>='0'&&ch2<='9')){
                        list.add(input.substring(index,last));
                        index=last-1;
                        break;
                    }else if(last==input.length()-1){
                        list.add(input.substring(index,last+1));
                        index=last-1;
                    }
                }
                if(last==index+1){
                    list.add(input.substring(index,index+1));
                }
            }
        }
        String result="";
        for(String x:list){
            if(x.length()>result.length()){
                result=x;
            }
        }
        System.out.println(result);
    }
}
