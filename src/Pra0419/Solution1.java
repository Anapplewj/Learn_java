package Pra0419;

import java.util.Scanner;

//将一个字符串转换为数字,分为正数和负数
//如果不是字符串则返回0,+和空均表示正数,-表示负数,空也可以
public class Solution1 {
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.nextLine();
            System.out.println(StrToInt(input));
        }
    }
    public static int StrToInt(String str) {
        sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!(ch==' '||ch=='+'||ch=='-'||(ch>='0'&&ch<='9'))){
                return 0;
            }else if(ch=='-'){
                if(sb.length()==0) {
                    sb.append(ch);
                }else{
                    return 0;
                }
            }else if(ch>='0'&&ch<='9'){
                if(ch=='0'&&(sb.length()==0||sb.charAt(0)=='-')){
                    continue;
                }
                sb.append(ch);
            }
        }
        if (sb.length()==0){
            return 0;
        }
        return Integer.parseInt(sb.toString());
    }
}
